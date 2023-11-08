// https://leetcode.com/problems/implement-queue-using-stacks/
// Author: Andrew Jarombek
// Date: 11/7/2023

#include <cassert>
#include <stack>

using namespace std;

class MyQueue {
private:
    stack<int> pushStack;
    stack<int> popStack;
public:
    MyQueue() {
        pushStack = stack<int>();
        popStack = stack<int>();
    }

    void push(int x) {
        if (popStack.empty()) {
            pushStack.push(x);
        } else {
            while (!popStack.empty()) {
                pushStack.push(popStack.top());
                popStack.pop();
            }

            pushStack.push(x);
        }
    }

    int pop() {
        if (popStack.empty()) {
            while (!pushStack.empty()) {
                popStack.push(pushStack.top());
                pushStack.pop();
            }

            int top = popStack.top();
            popStack.pop();
            return top;
        } else {
            int top = popStack.top();
            popStack.pop();
            return top;
        }
    }

    int peek() {
        if (popStack.empty()) {
            while (!pushStack.empty()) {
                popStack.push(pushStack.top());
                pushStack.pop();
            }

            return popStack.top();
        } else {
            return popStack.top();
        }
    }

    bool empty() {
        return pushStack.empty() && popStack.empty();
    }
};

int main() {
    MyQueue queue = MyQueue();

    queue.push(1);
    queue.push(2);
    queue.push(3);

    assert(queue.peek() == 1);
    assert(queue.pop() == 1);
    assert(queue.pop() == 2);
    assert(queue.pop() == 3);
    assert(queue.empty());

    queue.push(1);
    queue.push(2);
    queue.push(3);

    assert(queue.pop() == 1);
    assert(queue.pop() == 2);
    assert(queue.pop() == 3);
    assert(queue.empty());

    return 0;
}
