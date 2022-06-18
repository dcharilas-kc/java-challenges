package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BirdMountainTest {

    @Test
    public void test1() {
        BirdMountain birdMountain = new BirdMountain();
        char[][] mountain = {
                "^^^^^^        ".toCharArray(),
                " ^^^^^^^^     ".toCharArray(),
                "  ^^^^^^^     ".toCharArray(),
                "  ^^^^^       ".toCharArray(),
                "  ^^^^^^^^^^^ ".toCharArray(),
                "  ^^^^^^      ".toCharArray(),
                "  ^^^^        ".toCharArray()
        };
        assertEquals(3, birdMountain.peakHeight(mountain));
    }
}
