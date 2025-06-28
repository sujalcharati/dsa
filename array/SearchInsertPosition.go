// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2

package main
func searchInsert(nums []int, target int) int {
    n := len(nums)
    left := 0
    right :=n-1


     for left <= right {
        mid :=left + (right -left)/2
        
        if nums[mid] == target {
            return mid
        } else if nums[mid] > target {
               right = mid - 1
        } else {
            left = mid + 1
        }
     } 
     return left
    
}


// what i learned is when you see sorted array u should be clicked to binary search and its implementation 