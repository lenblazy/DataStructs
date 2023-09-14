package com.lenibonje.challenges

/*
Given an integer array nums, return an array answer such that answer[i] is equal
 to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does
not count as extra space for space complexity analysis.)
 */

fun productExceptSelf(nums: IntArray): IntArray {
    val prefixProduct = IntArray(nums.size)
    prefixProduct[0] = 1

    for (item in 1 until nums.size){
        prefixProduct[item] = prefixProduct[item - 1] * nums[item - 1]
    }

    var suffixProduct = 1
    for (item in nums.size - 1 downTo 0){
        prefixProduct[item] = prefixProduct[item] * suffixProduct
        suffixProduct *= nums[item]
    }

    return prefixProduct

}

fun main(){
    val ans = productExceptSelf(intArrayOf(1,2,3,4))
    println("Answer is ${ans.iterator().forEach { println(it) }}")
}