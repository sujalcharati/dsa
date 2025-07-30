package main
// Online Go compiler to run Golang program online
// Print "Try programiz.pro" message

// stack implementation using the array
import "fmt"


type stack struct {
    elements []int
}

func (s *stack) push( value int){
    s.elements = append(s.elements,value)
}

func (s *stack) pop() int{
    
    if len(s.elements) == 0 {
        fmt.Println(" stack is empty")
        return -1
    }
    top := s.elements[len(s.elements)-1]
    s.elements = s.elements[: len(s.elements)-1]
    
    return top
}

func (s *stack) peek() int {
    
    if len(s.elements) == 0 {
        fmt.Println(" stack is empty")
    }
    
    return s.elements[len(s.elements)-1]
}   
func main() {
  
  var s stack
  s.push(4)
  s.push(3)
  fmt.Println(s.pop())
  fmt.Println(s.peek())
  s.push(6)
  fmt.Println(s.peek())
}

// stack implementation using linkedlist

// Online Go compiler to run Golang program online
// Print "Try programiz.pro" message

package main
import "fmt"


type Node struct {
    data int
    Next *Node
}

type stack1 struct {
    head *Node
    size int
}

func (s *stack1) push( value int){
    newnode := &Node {
        data : value,
        Next : s.head,
    }
    s.head = newnode
    s.size ++
}

func (s *stack1) pop() (int, bool) {
    
    if s.head == nil {
        fmt.Println(" the stack is empty")
        return 0, false
    }
    
    top := s.head.data
    s.head = s.head.Next
    s.size--
    
    return top,true
}

func (s *stack1) peek() (int ,bool){
    
    if s.head == nil {
        fmt.Println(" the stack is empty")
        return 0, false
    }
    
    return s.head.data,true
}

func (s *stack1) sizeof() int {
  
  return s.size   
}

func main(){
    var st stack1 
    st.push(3)
    fmt.Println(st.peek())
    st.push(4)
    fmt.Println(st.pop())
    fmt.Println(st.peek())
}



// implement stack using queue

package main
import "fmt"
import (
     "container/list"
    )


type stack struct {
    queue *list.List
}

func ( s *stack) push( val int){
    s.queue.PushBack(val)
}

func (s *stack) pop() int{
    
    if s.queue.Len() == 0 {
       fmt.Println(" stack is empty")
       return -1
    }
    
    for s.queue.Len() > 1 {
        front := s.queue.Front()
        s.queue.Remove(front)
        s.queue.PushBack(front.Value)
    }
    
    top := s.queue.Front().Value.(int)
    s.queue.Remove(s.queue.Front())
    return top
}


func (s *stack) peek() int {
    if s.queue.Len() == 0 {
        fmt.Println("stack is empty")
        return -1
    }

    for s.queue.Len() > 1 {
        front := s.queue.Front()
        s.queue.Remove(front)
        s.queue.PushBack(front.Value)
    }

    top := s.queue.Front().Value.(int)

    front := s.queue.Front()
    s.queue.Remove(front)
    s.queue.PushBack(front.Value)

    return top
}

func main() {
    stack := &stack{queue: list.New()}
    fmt.Println("The elements in stack are:\n")

    stack.push(10)
    stack.push(20)

    fmt.Println("Pop:", stack.pop())  
    fmt.Println("Pop:", stack.pop())   
    fmt.Println("Peek:", stack.peek())    

    stack.push(30)
    fmt.Println("Peek:", stack.peek())  
    fmt.Println("Pop:", stack.pop())      
    fmt.Println("Pop:", stack.pop())   
}



