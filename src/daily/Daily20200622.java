package daily;

import java.util.Stack;

/*
스택(Stack)을 이용해서 큐(Queue)를 구현하시오.
Implement a queue using stacks.
 */
public class Daily20200622 {

    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    private static void solution () {
        int[] arr = {1,2,3,4,5,6,7,8};

        // enqueue
        for(int i=0; i<arr.length; i++) {
            enqueue(arr[i]);
        }
        // dequeue
        for(int i=0; i<arr.length; i++) {
            System.out.println(dequeue());
        }
    }

    private static void enqueue (int value) {
        stack1.add(value);
    }

    private static int dequeue () {
        if(stack2.isEmpty()) {
            if(stack1.isEmpty()) return -1;
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        solution();
    }
}
