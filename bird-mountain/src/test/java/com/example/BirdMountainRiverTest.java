package com.example;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BirdMountainRiverTest {

    @Test
    public void test1() {
        BirdMountainRiver birdMountain = new BirdMountainRiver();
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
        assertArrayEquals(new int[]{189,99,19,3}, birdMountain.dryGround(terrain));
    }

    @Test
    public void test_noriver() {
        BirdMountainRiver birdMountain = new BirdMountainRiver();
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
        //TODO verify this is the expected result in case of no river
        assertArrayEquals(new int[]{189,189,189,189}, birdMountain.dryGround(terrain));
    }

}

