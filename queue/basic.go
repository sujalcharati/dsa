package queue

import "fmt"
type queue struct {
    elements []int
}

func (q *queue) push( value int){
    q.elements = append(q.elements,value)
}

func (q *queue) pop() int {
     if len(q.elements) == 0 {
         fmt.Println(" queue is empty")
     }
     
     front := q.elements[0]
     q.elements = q.elements[1:]
     return front
}

func (q *queue) peek() int{
      if len(q.elements) == 0 {
          fmt.Println(" queue is empty")
          return -1 
      }
      return q.elements[0]
}

func main(){
    
    var q queue 
    q.push(2)
    fmt.Println(q.pop())
    q.push(3)
    q.push(9)
    fmt.Println(q.peek())
    
}