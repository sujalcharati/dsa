
// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 

//Example 1:
// Input: head = [1,1,2]
// Output: [1,2]
// Example 2:




/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

 package linkedlist
type ListNode struct {
	Val int	
	Next *ListNode
}
func deleteDuplicates(head *ListNode) *ListNode {
    current := head
    
    
    for current != nil && current.Next !=nil {
        if current.Val == current.Next.Val {
            current.Next =current.Next.Next
        } else {
            current =current.Next
        }
    }
    return head

}


// what i learned from here is that to skip the next thing use the next pointer