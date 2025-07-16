package linkedlist

// Input: head = [1,2,2,1]
// Output: true
// Example 2:


// Input: head = [1,2]
// Output: false

/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func isPalindrome(head *ListNode) bool {

   if head == nil || head.Next == nil {
        return true
    }

    var slow *ListNode
    var fast *ListNode

    slow,fast = head,head

    for fast != nil && fast.Next !=nil {
         
         slow = slow.Next
         fast = fast.Next.Next
        }



    var prev *ListNode
    var next *ListNode

    prev = nil
    next = nil

    current := slow

    for current != nil {
      
      next = current.Next
      current.Next = prev
      prev = current
      current = next
    }

    first_half := head
    second_half := prev

       for second_half != nil {

        if  first_half.Val != second_half.Val {
            return false
        } 
         first_half = first_half.Next
         second_half = second_half.Next
       }
return true

}


// learned : i used the parallel 2 ptr where i knew if you want to get middle element you can make move one pointer to two nodes at a time and one poiter to move one node at once and the later node will result into middle element possible for the even / odd linkedlist.