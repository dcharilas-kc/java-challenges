package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BirdUnitTest {

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
    public void test_countMountains() {
        assertEquals(47, BirdMountain.countMountains(MOUNTAIN));
    }
}
