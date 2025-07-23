package stack

// Online Go compiler to run Golang program online
// Print "Try programiz.pro" message

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
  fmt.Println("Try programiz.pro")
  
  var s stack
  s.push(4)
  s.push(3)
  fmt.Println(s.pop())
//   s.push(5)
  fmt.Println(s.peek())
  s.push(6)
  fmt.Println(s.peek())
}