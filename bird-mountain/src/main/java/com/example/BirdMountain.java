package com.example;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Objects.isNull;

public class BirdMountain {

    private static int height = 1;
    private static char[][] mountain;
    private static long remainingMountains;

    public static int peakHeight(char[][] input) {
        height = 1;
        mountain = input;
        remainingMountains = countMountains();

        while (remainingMountains > 0) {
            System.out.println("Remaining mountains: " + remainingMountains);
            scanMountain();
            printMountain();
            height++;
        }
        return height-1;
    }

    private static void printMountain() {
        for (int i = 0; i < mountain.length; i++) {
            String line = "";
            for (int j = 0; j < mountain[0].length; j++) {
                line += mountain[i][j] + " ";
            }
            System.out.println(line);
        }
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

    /** used for testing  */
    public static long countMountains(char[][] input) {
        mountain = input;
        return countMountains();
    }

}
