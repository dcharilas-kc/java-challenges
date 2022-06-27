package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BirdMountainTest {

    char[][] MOUNTAIN = {
            "^^^^^^        ".toCharArray(),
            " ^^^^^^^^     ".toCharArray(),
            "  ^^^^^^^     ".toCharArray(),
            "  ^^^^^       ".toCharArray(),
            "  ^^^^^^^^^^^ ".toCharArray(),
            "  ^^^^^^      ".toCharArray(),
            "  ^^^^        ".toCharArray()
    };

    char[][] ONE = {"  ^^  ".toCharArray()};

    char[][] ZERO = {"    ".toCharArray()};

    char[][] RANDOM = {
            "                          ^^^^^^^^^^^^^^^^        ".toCharArray(),
            "                           ^^^^^^^^^^^^^          ".toCharArray(),
            "                         ^^^^^^^^^^^^^^^          ".toCharArray(),
            "                           ^^^^^^^^^^^^^          ".toCharArray(),
            "                         ^^^^^^^^^^^^^^           ".toCharArray(),
            "                       ^^^^^^^^^^^^^^^            ".toCharArray(),
            "                      ^^^^^^^^^^^^^^              ".toCharArray(),
            "                      ^^^^^^^^^^^^^^              ".toCharArray(),
            "                       ^^^^^^^^^^^^               ".toCharArray(),
            "                        ^^^^^^^^^                 ".toCharArray(),
            "                         ^^^^^^^                  ".toCharArray(),
            "                          ^^^^^^                  ".toCharArray(),
            "                           ^^^^^^                 ".toCharArray(),
            "                            ^^^^^                 ".toCharArray(),
            "                            ^^^                   ".toCharArray(),
            "                            ^                     ".toCharArray(),
            "                                                  ".toCharArray(),
            "                           ^^^                    ".toCharArray(),
            "                          ^^^^^^                  ".toCharArray(),
            "                           ^^^                    ".toCharArray(),
            "                          ^^^                     ".toCharArray(),
            "                          ^^^                     ".toCharArray(),
            "                         ^^^^^                    ".toCharArray(),
            "                         ^^^^^^                   ".toCharArray(),
            "                         ^^^^^^^^                 ".toCharArray()
    };

    char[][] PLATEAU = {
            "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
            "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
            "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
            "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
            "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
            "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
            "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
            "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
            "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
            "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
            "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
            "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
            "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
            "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
            "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
            "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
            "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
            "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
            "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
            "^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
            "^^^^^^^^^^^^^^^^^^^^^".toCharArray()
    };

    char[][] VOLCANO = {
            "      ^^^^^^^^^      ".toCharArray(),
            "    ^^^^^^^^^^^^^    ".toCharArray(),
            "  ^^^^^^^^^^^^^^^^^  ".toCharArray(),
            " ^^^^^^^     ^^^^^^^ ".toCharArray(),
            "^^^^^^^       ^^^^^^^".toCharArray(),
            "^^^^^^^       ^^^^^^^".toCharArray(),
            "^^^^^^^       ^^^^^^^".toCharArray(),
            " ^^^^^^^     ^^^^^^^ ".toCharArray(),
            "  ^^^^^^^^^^^^^^^^^  ".toCharArray(),
            "    ^^^^^^^^^^^^^    ".toCharArray(),
            "      ^^^^^^^^^      ".toCharArray()
    };

    @Test
    public void test_default() {
        assertEquals(3, BirdMountain.peakHeight(MOUNTAIN));
    }

    @Test
    public void test_big_mountain() {
        assertEquals(6, BirdMountain.peakHeight(RANDOM));
    }

    @Test
    public void test_one() {
        assertEquals(1, BirdMountain.peakHeight(ONE));
    }

    @Test
    public void test_zero() {
        assertEquals(0, BirdMountain.peakHeight(ZERO));
    }

    @Test
    public void test_plateau() {
        assertEquals(11, BirdMountain.peakHeight(PLATEAU));
    }

    @Test
    public void test_volcano() {
        assertEquals(4, BirdMountain.peakHeight(VOLCANO));
    }
}
