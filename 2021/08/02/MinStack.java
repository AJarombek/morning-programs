/**
 * https://leetcode.com/problems/min-stack/
 * @author Andrew Jarombek
 * @since 8/2/2021
 */

import java.util.LinkedList;

class MinStack {

    private LinkedList<Integer> stack;
    private LinkedList<Integer> minValues;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new LinkedList<>();
        minValues = new LinkedList<>();
    }

    public void push(int val) {
        Integer priorMin = minValues.peekLast();
        stack.add(val);

        if (priorMin == null || val < priorMin) {
            minValues.add(val);
        } else {
            minValues.add(priorMin);
        }
    }

    public void pop() {
        minValues.pollLast();
        stack.pollLast();
    }

    public int top() {
        return stack.peekLast();
    }

    public int getMin() {
        return minValues.peekLast();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(1);
        minStack.push(-3);

        assert minStack.getMin() == -3;

        minStack.pop();

        assert minStack.getMin() == -2;
        assert minStack.top() == 1;
    }
}