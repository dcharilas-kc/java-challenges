package com.example

import java.util.*

class CockroachScatterKotlin(val room: Array<CharArray>) {


    private enum class Direction(val dx: Int, val dy: Int, val letter: Char) {
        UP(0, -1, 'U'),
        LEFT(-1, 0, 'L'),
        DOWN(0, 1, 'D'),
        RIGHT(1, 0, 'R');

        var leftTurnDirection: Direction? = null

        companion object {
            init {
                // These can't be initialised in the constructor because of circular references.
                UP.leftTurnDirection = LEFT
                LEFT.leftTurnDirection = DOWN
                DOWN.leftTurnDirection = RIGHT
                RIGHT.leftTurnDirection = UP
            }

            fun findDirection(c: Char): Optional<Direction> {
                return Arrays.stream(values())
                    .filter { d: Direction -> d.letter == c }
                    .findFirst()
            }
        }
    }

    private var width = 0
    private var height = 0

    init {
        width = room[0].size
        height = room.size
    }

    companion object {
        @JvmStatic
        fun cockroaches(room: Array<CharArray>): IntArray {
            val cs = CockroachScatterKotlin(room)
            return cs.scatter()
        }
    }

    private fun scatter(): IntArray {
        val holeCounts = IntArray(10)
        for (x in 0 until width) {
            for (y in 0 until height) {
                val dir = Direction.findDirection(charAt(x, y))
                if (dir.isPresent) {
                    holeCounts[findHole(x, y, dir.get())]++
                }
            }
        }
        return holeCounts
    }

    private fun charAt(x: Int, y: Int): Char {
        return room[y][x]
    }

    private fun findHole(startX: Int, startY: Int, startDir: Direction): Int {
        var x = startX
        var y = startY
        var dir = startDir
        while (!Character.isDigit(charAt(x, y))) {
            if (!inRoom(x + dir.dx, y + dir.dy)) {
                dir = dir.leftTurnDirection!!
            }
            x += dir.dx
            y += dir.dy
        }
        return Character.getNumericValue(charAt(x, y))
    }

    private fun inRoom(x: Int, y: Int): Boolean {
        return x in 0 until width && y in 0 until height
    }

}