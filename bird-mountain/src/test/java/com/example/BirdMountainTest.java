package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BirdMountainTest {

    private final static BirdMountain birdMountain = new BirdMountain();
    char[][] MOUNTAIN = {
            "^^^^^^        ".toCharArray(),
            " ^^^^^^^^     ".toCharArray(),
            "  ^^^^^^^     ".toCharArray(),
            "  ^^^^^       ".toCharArray(),
            "  ^^^^^^^^^^^ ".toCharArray(),
            "  ^^^^^^      ".toCharArray(),
            "  ^^^^        ".toCharArray()
    };

    @Test
    public void test1() {
        assertEquals(3, birdMountain.peakHeight(MOUNTAIN));
    }

    @Test
    public void test_countMountains() {
        assertEquals(47, birdMountain.countMountains(MOUNTAIN));
    }

}
