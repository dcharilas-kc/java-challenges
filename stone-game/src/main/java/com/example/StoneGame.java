package com.example;

import java.util.Arrays;

/**
 * A solver for the <a href="https://leetcode.com/problems/stone-game/">stones game</a>.
 *
 * An efficient solution for a large number of piles requires dynamic programming, where
 * we solve it first for sub-arrays of length 1, then length 2, etc., using the previous
 * row to compute the next, until the whole array is solved.
 */
public class StoneGame {


    public boolean stoneGame(int[] piles) {

        // Array where element (i, j) is the best score possible for the subarray of piles starting
        // at pile i and extending to pile i+j.
        int[][] bestSolution = new int[piles.length][piles.length];

        // Fill in the first row (for subarrays of length 1) from the input data.
        bestSolution[0] = Arrays.copyOf(piles, piles.length);

        // The multiplier for adding in scores, that switches between 1 (benefiting Alice) and -1 (benefiting Bob).
        int multiplier = -1;

        // We've populated the first row already for length=1, so consider lengths from 2 on up.
        for (int len=2; len<=piles.length; len++) {

            // Consider each subarray starting position.
            for (int i=0; i<piles.length-len+1; i++) {

                // To compute the best for a subarray of length n, consider both the pile at the current
                // position plus the best for n-1 to the right of it...
                int left = multiplier * piles[i] + bestSolution[len-2][i + 1];
                // ...and the best for n-1 at the current position, plus the pile to the right of it.
                int right = bestSolution[len-2][i] + multiplier * piles[i+len-1];

                // Consider whose turn it is when computing which of the two options is best; Alice is trying
                // to maximise the score, while Bob is trying to minimise it.
                bestSolution[len-1][i] = multiplier == 1 ? Math.max(left, right) : Math.min(left, right);
            }

            // Switch whose turn it is.
            multiplier = -multiplier;
        }

        // If it ends on Bob's turn, then a positive value is bad for Alice.
        return multiplier == 1 ? bestSolution[piles.length-1][0] < 0 : bestSolution[piles.length-1][0] > 0;
    }
}
