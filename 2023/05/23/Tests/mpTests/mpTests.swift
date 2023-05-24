/**
 Unit tests for a sum-of-left-leaves program.
 - Author: Andrew Jarombek
 - Date: 5/23/2023
 */

import XCTest
@testable import mp


class SumOfLeftLeavesTests: XCTestCase {
    func testSumOfLeftLeaves() {
        let morningPrograms = MorningPrograms()

        // Test case 1
        let root1 = TreeNode(3)
        root1.left = TreeNode(9)
        root1.right = TreeNode(20)
        root1.right?.left = TreeNode(15)
        root1.right?.right = TreeNode(7)
        XCTAssertEqual(morningPrograms.sumOfLeftLeaves(root1), 24, "Test case 1 failed")

        // Test case 2
        let root2 = TreeNode(1)
        root2.left = TreeNode(2)
        root2.right = TreeNode(3)
        root2.left?.left = TreeNode(4)
        root2.left?.right = TreeNode(5)
        XCTAssertEqual(morningPrograms.sumOfLeftLeaves(root2), 4, "Test case 2 failed")
    }
}
