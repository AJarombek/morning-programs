// https://leetcode.com/problems/implement-stack-using-queues/
// Author: Andrew Jarombek
// Date: 11/3/2023

#include <cassert>
#include <queue>

using namespace std;

class MyStack {
private:
    queue<int>* q;
public:
    MyStack() {
        q = new queue<int>();
    }

    void push(int x) {
        q->push(x);

        for (int i = 0; i < q->size()-1; i++) {
            q->push(q->front());
            q->pop();
        }
    }

    int pop() {
        int result = q->front();
        q->pop();
        return result;
    }

    int top() {
        return q->front();
    }

    bool empty() {
        return q->empty();
    }
};

int main() {
    auto stack = new MyStack();
    stack->push(1);
    stack->push(2);
    assert(stack->top() == 2);
    assert(stack->pop() == 2);
    assert(stack->empty() == false);
    assert(stack->pop() == 1);
    assert(stack->empty() == true);
}
