package queue;

import java.util.Stack;

public class QueueImpl {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public QueueImpl() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        s1.push(x);
    }

    public int pop() {
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.pop();
    }

    public int peek() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {
        QueueImpl impl = new QueueImpl();
        impl.push(1);
        System.out.println(impl.peek());
        impl.push(2);
        System.out.println(impl.peek());
        System.out.println(impl.pop());
        System.out.println(impl.peek());

    }
}
