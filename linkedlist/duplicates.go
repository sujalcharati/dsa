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