/**
 * https://leetcode.com/problems/implement-queue-using-stacks/
 * Author: Andrew Jarombek
 * Date: 11/9/2022
 */

package _go

type MyQueue struct {
	pushStack []int
	popStack  []int
}

func Constructor() MyQueue {
	return MyQueue{}
}

func (queue *MyQueue) Push(x int) {
	if len(queue.pushStack) == 0 && len(queue.popStack) > 0 {
		for len(queue.popStack) > 0 {
			queue.pushStack = append(queue.pushStack, queue.popStack[len(queue.popStack)-1])
			queue.popStack = queue.popStack[:len(queue.popStack)-1]
		}
	}

	queue.pushStack = append(queue.pushStack, x)
}

func (queue *MyQueue) Pop() int {
	if len(queue.popStack) == 0 && len(queue.pushStack) > 0 {
		for len(queue.pushStack) > 0 {
			queue.popStack = append(queue.popStack, queue.pushStack[len(queue.pushStack)-1])
			queue.pushStack = queue.pushStack[:len(queue.pushStack)-1]
		}
	}

	result := queue.popStack[len(queue.popStack)-1]
	queue.popStack = queue.popStack[:len(queue.popStack)-1]
	return result
}

func (queue *MyQueue) Peek() int {
	if len(queue.popStack) == 0 && len(queue.pushStack) > 0 {
		for len(queue.pushStack) > 0 {
			queue.popStack = append(queue.popStack, queue.pushStack[len(queue.pushStack)-1])
			queue.pushStack = queue.pushStack[:len(queue.pushStack)-1]
		}
	}

	return queue.popStack[len(queue.popStack)-1]
}

func (queue *MyQueue) Empty() bool {
	return len(queue.pushStack) == 0 && len(queue.popStack) == 0
}
