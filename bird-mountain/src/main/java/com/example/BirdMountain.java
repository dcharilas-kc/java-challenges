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

    public int peakHeight(char[][] input) {
        mountain = input;
        remainingMountains = countMountains();

        while (remainingMountains > 0) {
            scanMountain();
            height++;
        }
        return height;
    }

    private void scanMountain() {
        for (int i = 0; i < mountain.length; i++) {
            for (int j = 0; j < mountain[0].length; j++) {
                if (isEdge(i, j)) {
                    //TODO - check if this is valid
                    mountain[i][j] = (char) height;
                    remainingMountains--;
                }
            }
        }
    }

    private boolean isEdge(int x, int y) {
        List<Character> neighbors = getNeighbors(x, y);
        return neighbors.stream().filter(n -> isNull(n) || ' ' == n.charValue()).count() > 0;
    }

    private boolean isActiveMountain(int x, int y) {
        return '^' == mountain[x][y];
    }

    private List<Character> getNeighbors(int x, int y) {
        List<Character> neighbors = new LinkedList<>();
        // same row
        neighbors.add(getElementValue(x - 1, y));
        neighbors.add(getElementValue(x + 1, y));
        // same column
        neighbors.add(getElementValue(x, y - 1));
        neighbors.add(getElementValue(x, y + 1));
        return neighbors;
    }

    private Character getElementValue(int x, int y) {
        return doesElementExist(x, y) ? mountain[x][y] : null;
    }

    private boolean doesElementExist(int x, int y) {
        return x > 0 && x < mountain.length && y > 0 && y < mountain[0].length;
    }

    private long countMountains() {
        return Stream.of(mountain)
                .flatMapToInt(cells -> IntStream.range(0, cells.length).filter(i -> cells[i] == '^'))
                .count();
    }

    /** used for testing  */
    public long countMountains(char[][] input) {
        mountain = input;
        return countMountains();
    }


}
