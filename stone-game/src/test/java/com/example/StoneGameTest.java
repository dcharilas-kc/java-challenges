package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StoneGameTest {

    StoneGame stoneGame = new StoneGame();

    @Test
    public void test1() {
        assertEquals(true, stoneGame.stoneGame(new int[]{5,3,4,5}));
    }

    @Test
    public void test2() {
        assertEquals(true, stoneGame.stoneGame(new int[]{3,7,2,3}));
    }

    @Test
    public void test_biglist() {
        assertEquals(true, stoneGame.stoneGame(new int[]{5,17,19,1,15,19,11,9,6,5,11,7,12,12,2,14,3,6,18,3}));
    }

}
