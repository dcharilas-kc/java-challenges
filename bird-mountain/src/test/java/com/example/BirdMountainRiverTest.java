package com.example;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BirdMountainRiverTest {

    @Test
    public void test1() {
        char[][] terrain = {
                "  ^^^^^^             ".toCharArray(),
                "^^^^^^^^       ^^^   ".toCharArray(),
                "^^^^^^^  ^^^         ".toCharArray(),
                "^^^^^^^  ^^^         ".toCharArray(),
                "^^^^^^^  ^^^         ".toCharArray(),
                "---------------------".toCharArray(),
                "^^^^^                ".toCharArray(),
                "   ^^^^^^^^  ^^^^^^^ ".toCharArray(),
                "^^^^^^^^     ^     ^ ".toCharArray(),
                "^^^^^        ^^^^^^^ ".toCharArray()
        };
        assertArrayEquals(new int[]{189,99,19,3}, BirdMountainRiver.dryGround(terrain));
    }

    @Test
    public void test_noriver() {
        char[][] terrain = {
                "  ^^^^^^             ".toCharArray(),
                "^^^^^^^^       ^^^   ".toCharArray(),
                "^^^^^^^  ^^^         ".toCharArray(),
                "^^^^^^^  ^^^         ".toCharArray(),
                "^^^^^^^  ^^^         ".toCharArray(),
                "^^^^^                ".toCharArray(),
                "   ^^^^^^^^  ^^^^^^^ ".toCharArray(),
                "^^^^^^^^     ^     ^ ".toCharArray(),
                "^^^^^        ^^^^^^^ ".toCharArray()
        };
        //TODO configure assert - only 1st element is known
        //assertArrayEquals(new int[]{189,0,0,0}, BirdMountainRiver.dryGround(terrain));
    }

    @Test
    public void test_nomountain() {
        char[][] terrain = {
                "          ".toCharArray(),
                "          ".toCharArray(),
                "          ".toCharArray(),
                "----------".toCharArray(),
                "          ".toCharArray(),
                "          ".toCharArray(),
                "          ".toCharArray()
        };
        //TODO configure assert - only 1st element is known
        //assertArrayEquals(new int[]{60,0,0,0}, BirdMountainRiver.dryGround(terrain));
    }

    @Test
    public void test_volcano() {
        char[][] terrain = {
                "---------------------".toCharArray(),
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
        //TODO configure assert - only 1st element is known
        //assertArrayEquals(new int[]{231,0,0,0}, BirdMountainRiver.dryGround(terrain));
    }

    @Test
    public void test_lake() {
        char[][] terrain = {
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^-----^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^-----^^^^^^^^^^".toCharArray(),
                "------------------^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^-----^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^-----^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray(),
                "^^^^^^^^^^^^^^^^^^^^^^^^^^^^".toCharArray()
        };
        //TODO configure assert - only 1st element is known
        //assertArrayEquals(new int[]{231,0,0,0}, BirdMountainRiver.dryGround(terrain));
    }
}

