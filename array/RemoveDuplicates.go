// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

// Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

// Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
// Return k.


// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.

package main 

func removeDuplicates(nums []int) int {
    n:=len(nums)
    i:=0
    for j:=1; j < n; j++ {
        if nums[j] != nums[i]{

            i++
           nums[i] = nums[j] 
        }
    }
    return i+1
     
    
}


// what i learnt from this is when we have compare like things think of two pointers and when you read the question properly try to bring some logical points that would help in contributing to the solutions .