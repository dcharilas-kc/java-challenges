package com.example

class StoneGameKotlin {
    fun stoneGame(piles: IntArray): Boolean {

        // Array where element (i, j) is the best score possible for the subarray of piles starting
        // at pile i and extending to pile i+j.
        val bestSolution = Array(piles.size) { IntArray(piles.size) }

        // Fill in the first row (for subarrays of length 1) from the input data.
        bestSolution[0] = piles.copyOf(piles.size)

        // The multiplier for adding in scores, that switches between 1 (benefiting Alice) and -1 (benefiting Bob).
        var multiplier = -1

        // We've populated the first row already for length=1, so consider lengths from 2 on up.
        for (len in 2..piles.size) {

            // Consider each subarray starting position.
            for (i in 0..piles.size - len) {

                // To compute the best for a subarray of length n, consider both the pile at the current
                // position plus the best for n-1 to the right of it...
                val left = multiplier * piles[i] + bestSolution[len - 2][i + 1]
                // ...and the best for n-1 at the current position, plus the pile to the right of it.
                val right = bestSolution[len - 2][i] + multiplier * piles[i + len - 1]

                // Consider whose turn it is when computing which of the two options is best; Alice is trying
                // to maximise the score, while Bob is trying to minimise it.
                bestSolution[len - 1][i] = if (multiplier == 1) Math.max(left, right) else Math.min(left, right)
            }

            // Switch whose turn it is.
            multiplier = -multiplier
        }

        // The very last iteration of the loop computed the solution we want, for the entire array.  But we
        // still need to consider whose turn it is.  If it ends on Bob's turn, then a positive value is bad
        // for Alice, and vice versa.
        return if (multiplier == 1) bestSolution[piles.size - 1][0] < 0 else bestSolution[piles.size - 1][0] > 0
    }

}