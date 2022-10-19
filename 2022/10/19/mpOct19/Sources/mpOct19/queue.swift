/**
 Queue data structure implemented in Swift
 - Author: Andrew Jarombek
 - Date: 10/19/2022
 */

import Foundation

class Node<T> {
    public var val: T
    public var next: Node<T>?
    public init(_ val: T, _ next: Node<T>?) {
        self.val = val;
        self.next = next;
    }
}

struct Queue<T> {
    private var data: Node<T>? = nil
    private var tail: Node<T>? = nil

    mutating func enqueue(_ value: T) {
        if data == nil {
            data = Node<T>(value, nil)
            tail = data
        } else {
            tail?.next = Node<T>(value, nil)
            tail = tail?.next
        }
    }

    mutating func dequeue() -> T? {
        guard data?.val != nil else {
            return nil
        }

        let val = data?.val
        data = data?.next
        return val
    }

    var head: T? {
        data?.val
    }
}