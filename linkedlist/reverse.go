
// Given the head of a singly linked list, reverse the list, and return the reversed list.

// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]


package linkedlist

/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func reverseList(head *ListNode) *ListNode {

    if head == nil {
        return nil
    }

    current := head
    var prev *ListNode
    prev = nil
    var next *ListNode
    next = nil

    for current !=nil {
        next = current.Next
        current.Next = prev
        prev = current
        current = next

    }
    head = prev

    return head

}