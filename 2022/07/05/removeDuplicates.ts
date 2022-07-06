/**
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 * @author Andrew Jarombek
 * @since 7/5/2022
 */

// Attempt #1 - Array (timeout for large strings)
function removeDuplicates(s: string): string {
    let chars = s.split("");
    let end = s.length - 1;

    while (end > 0) {
        let i = 0;

        while (i < end) {
            if (chars[i] == chars[i + 1]) {
                break;
            }

            i++;
        }

        if (i == end) {
            return chars.slice(0, end + 1).join("");
        } else {
            for (let j = i; j <= end - 2; j++) {
                chars[j] = chars[j + 2];
            }

            end -= 2;
        }
    }

    return chars.slice(0, end + 1).join("");
}

// Attempt #2 - Custom Linked List (timeout for large strings)
class LinkedList {
    value: string;
    next: LinkedList | null;

    constructor(value: string, next: LinkedList) {
        this.value = value;
        this.next = next;
    }
}

function removeDuplicates2(s: string): string {
    let head = new LinkedList(s.charAt(0), null);
    let node = head;
    let prev = null;

    for (let i = 1; i < s.length; i++) {
        node.next = new LinkedList(s.charAt(i), null);
        node = node.next;
    }

    while (head?.next != null) {
        let modified = false;
        node = head;
        prev = null;

        while (node?.next != null) {
            let a = node.value;
            let b = node.next.value;

            if (a == b) {
                if (!prev) {
                    head = node.next.next;
                    node = head;
                } else {
                    prev.next = node.next.next;
                    node = prev.next;
                }

                modified = true;
            } else {
                prev = node;
                node = node.next;
            }
        }

        if (!modified) {
            break;
        }
    }

    let chars = [];

    while (head) {
        chars.push(head.value);
        head = head.next;
    }

    return chars.join("");
}

// Success - Stack (using an array)
function removeDuplicates3(s: string): string {
    let result = [];

    for (let c of s) {
        if (result[result.length - 1] == c) {
            result.pop();
        } else {
            result.push(c);
        }
    }

    return result.join("");
}