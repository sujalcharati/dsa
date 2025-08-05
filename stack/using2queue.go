package main

import (
    // "fmt"
    "container/list"
)


type MyStack struct {
    
    queue1 *list.List
    queue2 *list.List
}


func Constructor() MyStack {
    return MyStack  {
        queue1: list.New(),
        queue2: list.New(),
    }
}


func (this *MyStack) Push(x int)  {
    
    this.queue1.PushBack(x)
}


func (this *MyStack) Pop() int {

    if this.queue1.Len() == 0 {
        // fmt.Println(" stack is empty")
        return 0
    }

    for this.queue1.Len() > 1 {

        front := this.queue1.Front()
        this.queue2.PushBack(front.Value)
        this.queue1.Remove(front)
    }

    top := this.queue1.Front().Value.(int)
    this.queue1.Remove(this.queue1.Front())

    this.queue1 , this.queue2 = this.queue2 , this.queue1

    return top

}


func (this *MyStack) Top() int {
    
    if this.queue1.Len() == 0 {
        // fmt.Println(" stack is empty")
        return -1
    }

    for this.queue1.Len() > 1 {
        front := this.queue1.Front()
        this.queue2.PushBack(front.Value)
        this.queue1.Remove(front)
    }

    top := this.queue1.Front().Value.(int)
    this.queue2.PushBack(top)
    this.queue1.Remove(this.queue1.Front())

    this.queue1 , this.queue2 = this.queue2 , this.queue1

   return top 
}


func (this *MyStack) Empty() bool {
    
    return this.queue1.Len() == 0
}


// func main(){

//     stack := Constructor()

//     stack.Push(10)
//     stack.Push(20)
//     stack.Pop()
//     stack.Top()
// }
