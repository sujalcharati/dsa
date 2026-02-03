package stackANDqueue.fundamentalsQuestion;

public class queueUsingArrays {


    static int[] queue = new int[100];
    static int start = -1;
    static int end = -1;
    static int size = 0;

    static void push(int x){

        if (size == queue.length) {
            System.out.println("no capacity..");
            return;
        }

        if (size == 0) {
            start = 0;
            end = 0;
            queue[end] = x;
        } else {
            end = (end + 1) % queue.length;
            queue[end] = x;
        }
        size++;
    }

    static void pop(){

        if (size == 0) {
            System.out.println("no element in the queue..");
            return;
        }

        if (size == 1) {
            start = end = -1;
        } else {
            start = (start + 1) % queue.length;
        }
        size--;
    }

    static int top(){

        if (size == 0) {
            System.out.println("no elements in queue...");
            return -1;
        }

        return queue[start];
    }

    static int size(){
        return size;
    }


    public static void main(String[] args) {
        
        push(2);
        push(3);
        push(4);
        push(5);

        for (int i = 0; i < size; i++) {
            System.out.print(queue[(start + i) % queue.length] + " ");
        }
        
        System.out.println();

        pop();
        int data =top();
        System.out.println(data);

        int final_size =size();
        System.out.println(final_size);


    }
    
}
