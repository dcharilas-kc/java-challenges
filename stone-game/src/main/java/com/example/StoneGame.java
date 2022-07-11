package com.example;

/**
 * An exhaustive search solution for the stones game.
 *
 * The original <a href="https://leetcode.com/problems/stone-game/">original description of this problem</a>
 * specifies that there are always an even number of piles at the start, but this solution will work for an
 * odd number of piles as well.  In fact, the only cases I could come up with where the second player can
 * win are when there are an odd number of piles!
 */
public class StoneGame {

    private int[] piles;

    public boolean stoneGame(int[] piles) {
        this.piles = piles;

        // This method call will return the actual best expected score for Alice, though the problem states that
        // we only care whether Alice can always win, so we can just check to see that that value is positive.
        return minimax(0, piles.length-1, 1, 0) > 0;
    }

    /**
     * A standard minimax algorithm to solve the stones game.  This returns the best possible score for the
     * player whose turn it is; positive values mean Alice is winning while negative values mean Bob is winning.
     * @param leftIndex     the index of the left pile
     * @param rightIndex    the index of the right pile
     * @param multiplier    either 1 or -1, depending on whether it is Alice's turn or not
     * @param score         the running score
     * @return              the best score possible for the player whose turn it is
     */
    private int minimax(int leftIndex, int rightIndex, int multiplier, int score) {
        if (leftIndex == rightIndex) {
            // There's one square left, so add it into the score and return it.
            return score + piles[leftIndex] * multiplier;
        }

        // Otherwise, try both options (either the player chooses from the left pile or the right) and recurse.
        int leftScore = minimax(leftIndex + 1, rightIndex, -multiplier, score + multiplier * piles[leftIndex]);
        int rightScore = minimax(leftIndex, rightIndex - 1, -multiplier, score + multiplier * piles[rightIndex]);
        if (multiplier == 1) {
            return Math.max(leftScore, rightScore);
        } else {
            return Math.min(leftScore, rightScore);
        }
    }
}
