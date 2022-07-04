package com.example;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class BirdMountainRiver {

    private static int height = 1;
    private static double riverHeight = -0.5;
    private static int totalPositions;
    private static char[][] mountain;
    private static long remainingMountains;

    public static int[] dryGround(char[][] terrain) {
        if (terrain.length == 0) {
            return new int[]{0,0,0,0};
        }

        height = 1;
        riverHeight = 0.5;
        mountain = terrain;
        remainingMountains = countMountains();
        totalPositions = terrain.length * terrain[0].length;

        while (remainingMountains > 0) {
            //System.out.println("Remaining mountains: " + remainingMountains);
            scanMountain();
            height++;
        }
        printMountain();

        int[] results = new int[4];
        results[0] = (int) getDryLands();
        for (int i=1; i<4; i++) {
            floodRiver();
            printMountain();
            results[i] = (int) getDryLands();
        }
        return results;
    }

    private static long getDryLands() {
        return totalPositions - countRivers();
    }

    private static void floodRiver() {
        int totalFlooded;
        do {
            totalFlooded = 0;
            for (int i = 0; i < mountain.length; i++) {
                for (int j = 0; j < mountain[0].length; j++) {
                    if (shouldFlood(i, j)) {
                        List<Character> neighbors = getNeighbors(i, j);
                        if (neighbors.stream().filter(n -> nonNull(n) && n.charValue() == '-').count() > 0) {
                            mountain[i][j] = '-';
                            totalFlooded++;
                        }
                    }
                }
            }
        } while (totalFlooded > 0);

        riverHeight += 1;
    }

    private static boolean shouldFlood(int x, int y) {
        return !isRiver(x,y) && (mountain[x][y] == ' ' || Character.getNumericValue(mountain[x][y]) < riverHeight);
    }

    private static void printMountain() {
        for (int i = 0; i < mountain.length; i++) {
            String line = "";
            for (int j = 0; j < mountain[0].length; j++) {
                line += mountain[i][j] + " ";
            }
            System.out.println(line);
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    private static void scanMountain() {
        char[][] mountainUpdated = cloneMountain(mountain);
        for (int i = 0; i < mountain.length; i++) {
            for (int j = 0; j < mountain[0].length; j++) {
                if (isActiveMountain(i,j) && isEdge(i, j)) {
                    mountainUpdated[i][j] = Character.forDigit(height,10);
                    remainingMountains--;
                }
            }
        }
        mountain = cloneMountain(mountainUpdated);
    }

    private static char[][] cloneMountain(char[][] mountainInput) {
        char[][] copiedMountain = new char[mountainInput.length][mountainInput[0].length];
        for (int i = 0; i < mountainInput.length; i++) {
            for (int j = 0; j < mountainInput[0].length; j++) {
                copiedMountain[i][j] = mountainInput[i][j];
            }
        }
        return copiedMountain;
    }

    private static boolean isEdge(int x, int y) {
        List<Character> neighbors = getNeighbors(x, y);
        return neighbors.stream().filter(n -> isNull(n) || '^' != n.charValue()).count() > 0;
    }

    private static boolean isActiveMountain(int x, int y) {
        return '^' == mountain[x][y];
    }

    private static boolean isRiver(int x, int y) {
        return '-' == mountain[x][y];
    }

    private static long countRivers() {
        return Stream.of(mountain)
                .flatMapToInt(cells -> IntStream.range(0, cells.length).filter(i -> cells[i] == '-'))
                .count();
    }

    private static List<Character> getNeighbors(int x, int y) {
        List<Character> neighbors = new LinkedList<>();
        // same row
        neighbors.add(getElementValue(x - 1, y));
        neighbors.add(getElementValue(x + 1, y));
        // same column
        neighbors.add(getElementValue(x, y - 1));
        neighbors.add(getElementValue(x, y + 1));
        return neighbors;
    }

    private static Character getElementValue(int x, int y) {
        return doesElementExist(x, y) ? mountain[x][y] : null;
    }

    private static boolean doesElementExist(int x, int y) {
        return x >= 0 && x < mountain.length && y >= 0 && y < mountain[0].length;
    }

    private static long countMountains() {
        return Stream.of(mountain)
                .flatMapToInt(cells -> IntStream.range(0, cells.length).filter(i -> cells[i] == '^'))
                .count();
    }
}
