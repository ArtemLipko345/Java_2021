package queueWithStacks;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);

        int one = queue.pop();
        int two = queue.pop();
        int three = queue.pop();

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }

}
