package com.lenibonje.challenges

import kotlin.math.max
import kotlin.math.min

/*
Maximum Product Subarray

Given an integer array nums, find a
subarray
 that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.



Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.


Constraints:

1 <= nums.length <= 2 * 104
-10 <= nums[i] <= 10
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */

fun maxProduct(nums: IntArray): Int {

    var ans = nums[0]
    var minProduct = nums[0]
    var maxProduct = nums[0]

    for(index in 1 until nums.size){
        if(nums[index] < 0){
            var tmp = maxProduct
            maxProduct = minProduct
            minProduct = tmp
        }

        minProduct = min(nums[index], nums[index] * minProduct)
        maxProduct = max(nums[index], nums[index] * maxProduct)
        ans = max(ans, maxProduct)
    }

    return ans
}

fun main(){
    val nums = intArrayOf(2, 3, -2, 4)
    val result = maxProduct(nums)
    println("Maximum Product Subarray: $result")
}

