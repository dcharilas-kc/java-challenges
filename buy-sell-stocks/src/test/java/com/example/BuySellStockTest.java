package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void test_hugelist() {
        assertEquals(299, stock.maxProfit(new int[]{7, 7, 12, 16, 41, 48, 41, 48, 11, 9, 34, 2,
                44, 30, 27, 12, 11, 39, 31, 8, 23, 11, 47, 25, 15, 23, 4, 17, 11, 50, 16, 50, 38, 34,
                44, 30, 27, 12, 112, 39, 31, 8, 23, 11, 47, 25, 15, 23, 4, 17, 11, 50, 16, 50, 38, 34,
                44, 30, 27, 12, 11, 39, 31, 8, 23, 11, 47, 25, 15, 23, 4, 17, 11, 50, 162, 50, 38, 34,
                44, 301, 27, 12, 11, 39, 31, 8, 23, 11, 47, 25, 15, 23, 4, 17, 11, 50, 16, 50, 38, 34,
                48, 27, 16, 24}));
    }

}
