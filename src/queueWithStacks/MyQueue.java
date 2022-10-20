package queueWithStacks;

import java.util.Stack;

class MyQueue {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    Stack<Integer> stack3 = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        stack3.push(x);
        while(!stack.isEmpty()){
            stack2.push(stack.pop());
        }
        stack.push(stack3.pop());
        while(!stack2.isEmpty()){
            stack.push(stack2.pop());
        }

    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

// 3 2 1    4         []
// []       1 2 3      4
// 4 3 2 1  []         []


