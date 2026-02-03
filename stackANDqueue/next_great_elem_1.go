package stack

func nextGreaterElement(nums1 []int, nums2 []int) []int {
    l1 := len(nums1)
    l2 := len(nums2)
    var ans []int

    for i :=0 ; i < l1 ; i++ {
        for j :=0 ; j < l2 ;j++ {
         
         found := false
            if nums1[i] == nums2[j]{
                for k := j+1 ; k < l2 ;k++ {
                    if nums2[j] < nums2[k]{
                        found = true 
                        ans = append(ans,nums2[k])
                        break
                    } 
                }
                    if !found {
                    ans = append(ans,-1)
                    }
                
            }
        }
    }

    return ans
}

