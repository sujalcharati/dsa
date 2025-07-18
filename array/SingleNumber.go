
// // Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

 

// Example 1:

// Input: nums = [2,2,1]

// Output: 1

package main

func singleNumber(nums []int) int {
    result:=0
    for _,val:= range nums{
        result^=val
    }
    return result
}


//  I learned how the x-0R operation is used for the remove the duplication of the number e.g., a^a=0 , a^0 =1