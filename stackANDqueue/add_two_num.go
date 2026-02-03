package stack

/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */


 // reversal approach...
func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
    
    var next *ListNode
    var prev *ListNode

    prev = nil
    next = nil

    if l1 == nil && l2 == nil {
        fmt.Print(" both the linkedlist are empty")
        return nil
    }
    
    current1 , current2 := l1, l2

    for current1 != nil {
      
      next = current1.Next
      current1.Next = prev
      prev = current1
      current1 = next 
    }
    l1 = prev

    prev = nil

    fmt.Print(l1)
    for current2 != nil {
      
      next = current2.Next
      current2.Next = prev
      prev = current2
      current2 = next 
    }
     l2 = prev
     fmt.Print(l2)
   
    for l1 != nil || l2 != nil {
        final := &ListNode{ Val: l1.Val + l2.Val }
        l1 = l1.Next
        l2 = l2.Next
    }
  return  final

}


// slice , append approach using arrays 

/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */


func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {

    var s1,s2 []int

    for current :=l1 ; current != nil ;current = current.Next {

        s1 = append(s1,current.Val)


    }

    for current :=l2 ; current != nil ; current = current.Next {

        s2 = append(s2, current.Val)
    }

    carry :=0
    var head *ListNode

    for len(s1) > 0 || len(s2) > 0 || carry > 0 {


        sum := carry 

        if len(s1) > 0 {
            sum += s1[len(s1)-1]
            s1 = s1[:len(s1)-1]
        }

        if len(s2) > 0 {
            sum += s2[len(s2)-1]
            s2 = s2[:len(s2)-1]
        }

        carry = sum/10
        digit := sum%10

        // var head *ListNode

        newnode := &ListNode{ Val :digit}
        newnode.Next = head
        head = newnode
    }

    return head

}