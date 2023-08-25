package com.lenibonje.challenges

/*
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */

fun containsDuplicate(nums: IntArray): Boolean {
    val set = hashSetOf<Int>()

    nums.forEach { value ->
        if (set.contains(value)) {
            return true
        } else {
            set.add(value)
        }
    }

    return false

}
//TC: 0(N) SC: 0(N)


fun main(){
    val ans = containsDuplicate(intArrayOf(7,1,5,3,6,4,1))
    println("Answer is $ans")
}