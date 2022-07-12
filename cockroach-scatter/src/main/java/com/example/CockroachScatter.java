package com.example;

import java.util.Arrays;
import java.util.Optional;

public class CockroachScatter {


    private enum Direction {
        UP(0, -1, 'U'),
        LEFT(-1, 0, 'L'),
        DOWN(0, 1, 'D'),
        RIGHT(1, 0, 'R');

        static {
            // These can't be initialised in the constructor because of circular references.
            UP.leftTurnDirection = LEFT;
            LEFT.leftTurnDirection = DOWN;
            DOWN.leftTurnDirection = RIGHT;
            RIGHT.leftTurnDirection = UP;
        }

        static Optional<Direction> findDirection(char c) {
            return Arrays.stream(Direction.values())
                    .filter(d -> d.letter == c)
                    .findFirst();
        }

        private final int dx;
        private final int dy;
        private final char letter;
        Direction leftTurnDirection;

        Direction(int dx, int dy, char letter) {
            this.dx = dx;
            this.dy = dy;
            this.letter = letter;
        }
    }

    final char[][] room;
    final int width;
    final int height;

    public CockroachScatter(char[][] room) {
        this.room = room;
        this.width = room[0].length;
        this.height = room.length;
    }

    public static int[] cockroaches(final char[][] room) {

        CockroachScatter cs = new CockroachScatter(room);
        return cs.scatter();
    }

    private int[] scatter() {
        int[] holeCounts = new int[10];
        for (int x=0; x<width; x++) {
            for (int y=0; y<height; y++) {
                Optional<Direction> dir = Direction.findDirection(charAt(x, y));
                if (dir.isPresent()) {
                    holeCounts[findHole(x, y, dir.get())]++;
                }
            }
        }
        return holeCounts;
    }

    private char charAt(int x, int y) {
        return room[y][x];
    }

    private int findHole(int x, int y, Direction dir) {
        while (!Character.isDigit(charAt(x, y))) {
            if (!inRoom(x + dir.dx, y + dir.dy)) {
                dir = dir.leftTurnDirection;
            }
            x += dir.dx;
            y += dir.dy;
        }
        return Character.getNumericValue(charAt(x, y));
    }

    private boolean inRoom(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }
}
