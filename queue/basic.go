// package main

// import "fmt"

// type queue struct {
// 	elements []int
// }

// func (q *queue) push(value int) {
// 	q.elements = append(q.elements, value)
// }

// func (q *queue) pop() int {
// 	if len(q.elements) == 0 {
// 		fmt.Println(" queue is empty")
// 		return -1 
// 	}

// 	front := q.elements[0]
// 	q.elements = q.elements[1:]
// 	return front
// }

// func (q *queue) peek() int {
// 	if len(q.elements) == 0 {
// 		fmt.Println(" queue is empty")
// 		return -1
// 	}
// 	return q.elements[0]
// }

// func main() {

// 	var q queue
// 	q.push(2)
// 	fmt.Println(q.pop())
// 	q.push(3)
// 	q.push(9)
// 	fmt.Println(q.peek())

// }


// queue using linkedlist 

package main
import "fmt"

type Node struct {

	data int
	Next *Node
}
type queue struct {
	head *Node
	tail *Node
	size int
}

// Removed unused global variables and invalid short declaration



func (q *queue) push(val int) {
	newnode := &Node{
		data: val,
		Next: nil,
	}

	if q.head == nil {
		q.head = newnode
		q.tail = newnode
	} else {
		q.tail.Next = newnode
		q.tail = newnode
	}
	q.size++
}
func (q *queue) pop() (int, bool) {
	if q.head == nil {
		fmt.Print(" queue is empty")
		return 0, false
	}

	top := q.head.data
	q.head = q.head.Next
	if q.head == nil {
		q.tail = nil
	}
	q.size--
	return top, true
}
func (q *queue) peek() (int, bool) {
	if q.head == nil {
		fmt.Print(" queue is empty")
		return 0, false
	}

	top := q.head.data
	return top, true
}

func main(){

	var q queue
	q.push(3)
	q.push(5)
	fmt.Print(q.peek())
	q.pop()
	fmt.Print(q.peek())
}