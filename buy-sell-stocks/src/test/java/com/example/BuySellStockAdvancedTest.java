package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuySellStockAdvancedTest {

    BuySellStockAdvanced stock = new BuySellStockAdvanced();

    @Test
    public void test1() {
        assertEquals(6,stock.maxProfit(new int[]{3,3,5,0,0,3,1,4}));
    }

    @Test
    public void test2() {
        assertEquals(4,stock.maxProfit(new int[]{1,2,3,4,5}));
    }

    @Test
    public void test3() {
        assertEquals(0,stock.maxProfit(new int[]{7,6,4,3,1}));
    }
}
