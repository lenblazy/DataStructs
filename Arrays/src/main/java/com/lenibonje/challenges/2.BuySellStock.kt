package com.lenibonje.challenges

import kotlin.math.max

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a
different day in the future to sell that stock. Return the maximum profit you can achieve from
this transaction. If you cannot achieve any profit, return 0.

Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

Constraints:

1 <= prices.length <= 105
0 <= prices[i] <= 104
 */

fun buySellStock(prices: IntArray): Int {
    if (prices.size < 2) return 0

    var profit = 0
    var leftPointer = 0

    for (rightPointer in 1 until prices.size) {
        if (prices[rightPointer] > prices[leftPointer]) {
            profit = max(profit, prices[rightPointer] - prices[leftPointer])
        } else {
            leftPointer = rightPointer
        }
    }

    return profit
}
//TC: 0(N) SC: 0(1)


fun main(){
    val ans = buySellStock(intArrayOf(7,1,5,3,6,4))
    println("Answer is $ans")
}