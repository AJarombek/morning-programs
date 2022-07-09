/**
 * https://leetcode.com/problems/implement-queue-using-stacks/
 * @author Andrew Jarombek
 * @since 7/8/2022
 */

import java.util.Stack;

class MyQueue {
    private Stack<Integer> stack;
    private final Stack<Integer> queue;
    private int popped;

    public MyQueue() {
        this.stack = new Stack<>();
        this.queue = new Stack<>();
        this.popped = 0;
    }

    public void push(int x) {
        this.stack.push(x);
    }

    public int pop() {
        if (this.queue.empty()) {
            Object[] stackItems = this.stack.toArray();
            for (int i = stackItems.length - 1; i > popped; i--) {
                this.queue.push((int) stackItems[i]);
            }

            this.stack = new Stack<>();

            for (int i = popped + 1; i < stackItems.length; i++) {
                this.stack.push((int) stackItems[i]);
            }

            return (int) stackItems[popped];
        } else {
            this.popped++;
            return this.queue.pop();
        }
    }

    public int peek() {
        if (this.queue.empty()) {
            Object[] stackItems = this.stack.toArray();
            for (int i = stackItems.length - 1; i >= popped; i--) {
                this.queue.push((int) stackItems[i]);
            }
        }

        return this.queue.peek();
    }

    public boolean empty() {
        return this.stack.size() - popped == 0;
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);

        assert queue.peek() == 1;
        assert !queue.empty();

        int val = queue.pop();
        assert val == 1;

        queue.pop();
        assert queue.empty();
    }
}