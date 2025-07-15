package main
import "fmt"
// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

 

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]



func moveZeroes(nums []int)  {
    n := len(nums)
    left := 0
    for right:= 0; right < n; right++ {
        if nums[right] != 0{
            temp := nums[left]
            nums[left] = nums[right]
            nums[right] = temp
            left++
        }
    }


}



// what i learned is this is two pointer like parallel pointer where one pointer is busy in finding the non zero element and other is busy in keeping track of that non zero



//brute force 
// Online Go compiler to run Golang program online
// Print "Try programiz.pro" message

func makeittozeros( nums []int ) [] int{
    n:=len(nums)
    temp := [] int{}
    
    for i := 0;i< n;i++{
        
    if nums[i] != 0 {
        temp = append(temp, nums[i])
       }
    }
    
    zerocount := len(nums)-len(temp)
    
    for i :=0; i < zerocount ; i++{
        temp = append(temp,0)
    }
    return temp
    
}
func main() {
    
    nums := [] int {0,1,0,2,3,0}
    val := makeittozeros(nums)
    fmt.Println(val)
    
    
  fmt.Println("Try programiz.pro")
}