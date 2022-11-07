/**
 * https://leetcode.com/problems/implement-stack-using-queues/
 * Author: Andrew Jarombek
 * Date: 11/6/2022
 */

package _go

type MyStack struct {
	items []int
}

func Constructor() MyStack {
	return MyStack{items: []int{}}
}

func (stack *MyStack) Push(x int) {
	stack.items = append(stack.items, x)
}

func (stack *MyStack) Pop() int {
	var newItems []int

	for len(stack.items) > 1 {
		newItems = append(newItems, stack.items[0])
		stack.items = stack.items[1:]
	}

	value := stack.items[0]
	stack.items = newItems
	return value
}

func (stack *MyStack) Top() int {
	return stack.items[len(stack.items)-1]
}

func (stack *MyStack) Empty() bool {
	return len(stack.items) == 0
}
