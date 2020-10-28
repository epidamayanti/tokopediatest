package com.tokopedia.minimumpathsum


object Solution {
    fun minimumPathSum(matrix: Array<IntArray>): Int {
        if(matrix.isEmpty())
            return 0

        else {
            val m = matrix.size
            val n: Int = matrix[0].size
            val dp = Array(m) { IntArray(n) }
            dp[0][0] = matrix[0][0]

            for (i in 1 until n) {
                dp[0][i] = dp[0][i - 1] + matrix[0][i]
            }

            for (j in 1 until m) {
                dp[j][0] = dp[j - 1][0] + matrix[j][0]
            }

            for (i in 1 until m) {
                for (j in 1 until n) {
                    if (dp[i - 1][j] > dp[i][j - 1]) {
                        dp[i][j] = dp[i][j - 1] + matrix[i][j]
                    } else {
                        dp[i][j] = dp[i - 1][j] + matrix[i][j]
                    }
                }
            }
            return dp[m - 1][n - 1]
        }
    }

}
