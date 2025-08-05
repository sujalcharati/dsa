package queue

import (
    "container/list"
)

type MyQueue struct {
    stack1 *list.List
    stack2 *list.List
}


func Constructor() MyQueue {

    return MyQueue {
        stack1: list.New(),
        stack2: list.New(),
    }
    
}


func (this *MyQueue) Push(x int)  {

    this.stack1.PushBack(x)
    
}


func (this *MyQueue) Pop() int {

 if this.stack2.Len() == 0 {


 for this.stack1.Len() > 0 {

    back := this.stack1.Back()
    this.stack2.PushBack(back.Value)
    this.stack1.Remove(back)

 }
 }   

    top := this.stack2.Back().Value.(int)
    this.stack2.Remove(this.stack2.Back())
   return top
}


func (this *MyQueue) Peek() int {
    
    if this.stack2.Len() == 0 {

        for this.stack1.Len() > 0 {

            back := this.stack1.Back().Value.(int)
            this.stack2.PushBack(back)
            this.stack1.Remove(this.stack1.Back())

        }


    }
    return this.stack2.Back().Value.(int)
}


func (this *MyQueue) Empty() bool {
    return this.stack1.Len() == 0 && this.stack2.Len() == 0
}


/**
 * Your MyQueue object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Push(x);
 * param_2 := obj.Pop();
 * param_3 := obj.Peek();
 * param_4 := obj.Empty();
 */