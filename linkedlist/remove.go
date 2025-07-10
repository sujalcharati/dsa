// Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

// Input: head = [1,2,6,3,4,5,6], val = 6
// Output: [1,2,3,4,5]
// Example 2:

// Input: head = [], val = 1
// Output: []
// Example 3:

// Input: head = [7,7,7,7], val = 7
// Output: []


package linkedlist

/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */ 
 
func removeElements(head *ListNode, val int) *ListNode {
    
    if head == nil {
      return nil
    }

    for head!=nil && head.Val==val {
        head = head.Next
        }

    current :=head;
    for current != nil {
    
        if  current.Next!=nil && current.Next.Val == val{
             current.Next =current.Next.Next
        } else{
            current = current.Next
        }
    }
    return head
}