package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuySellStockTest {

    BuySellStock stock = new BuySellStock();

    @Test
    public void test1() {
        assertEquals(5,stock.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void test2() {
        assertEquals(0,stock.maxProfit(new int[]{7,6,4,3,1}));
    }
}
