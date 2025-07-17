package linkedlist

// Example 1:


// Input: head = [3,2,0,-4], pos = 1
// Output: true
// Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).


/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func hasCycle(head *ListNode) bool {
  
  if head == nil || head.Next == nil  {
    return false
  }
  
  var slow *ListNode 
  var fast *ListNode

  slow , fast = head ,head

 for fast.Next != nil && fast.Next.Next != nil {
  slow = slow.Next
  fast = fast.Next.Next
  if slow == fast {
    return true
  }
 }
  return false
}



// learned : i used the parallel pointer with slow and fast where i knew if there is cycle then the both pointer would meet otherwise there is no cycle.