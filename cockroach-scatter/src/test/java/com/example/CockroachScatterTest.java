package com.example;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CockroachScatterTest {

    @Test
    public void test1() {
        char[][] room = {
                "+----------------0---------------+".toCharArray(),
                "|                                |".toCharArray(),
                "|                                |".toCharArray(),
                "|          U        D            |".toCharArray(),
                "|     L                          |".toCharArray(),
                "|              R                 |".toCharArray(),
                "|           L                    |".toCharArray(),
                "|  U                             1".toCharArray(),
                "3        U    D                  |".toCharArray(),
                "|         L              R       |".toCharArray(),
                "|                                |".toCharArray(),
                "+----------------2---------------+".toCharArray()
        };
        final int[] expected = new int[]{1,2,2,5,0,0,0,0,0,0};
        assertArrayEquals(expected, CockroachScatter.cockroaches(room));
    }

    @Test
    public void test_cornerholes() {
        char[][] room = {
                "2-----------4".toCharArray(),
                "|           |".toCharArray(),
                "|    UD     |".toCharArray(),
                "|    RL     |".toCharArray(),
                "|           |".toCharArray(),
                "6-----------8".toCharArray()
        };
        final int[] expected = new int[]{0, 0, 1, 0, 1, 0, 1, 0, 1, 0};
        assertArrayEquals(expected, CockroachScatter.cockroaches(room));
    }

    @Test
    public void test_smallroom() {
        char[][] room = {
                "123".toCharArray(),
                "8U4".toCharArray(),
                "765".toCharArray()
        };
        final int[] expected = new int[]{0, 0, 1, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, CockroachScatter.cockroaches(room));
    }

    @Test
    public void test_noroaches() {
        char[][] room = {
                "2-----------4".toCharArray(),
                "|           |".toCharArray(),
                "|           |".toCharArray(),
                "|           |".toCharArray(),
                "|           |".toCharArray(),
                "6-----------8".toCharArray()
        };
        final int[] expected = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, CockroachScatter.cockroaches(room));
    }
}
