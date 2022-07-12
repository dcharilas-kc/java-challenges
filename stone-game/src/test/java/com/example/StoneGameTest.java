package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void test_hugelist() {
        assertTrue(stoneGame.stoneGame(new int[]{7,7,12,16,41,48,41,48,11,9,34,2,44,30,27,12,11,39,31,8,23,11,47,25,15,23,4,17,11,50,16,50,38,34,48,27,16,24,22,48,50,10,26,27,9,43,13,42,46,24}));
    }
}
