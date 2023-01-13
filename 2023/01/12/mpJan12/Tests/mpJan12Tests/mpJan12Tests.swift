/**
 Unit tests for valid-anagram program.
 - Author: Andrew Jarombek
 - Date: 1/12/2023
 */

import XCTest
@testable import mpJan12

final class mpJan12Tests: XCTestCase {
    func testProgram() throws {
        let mp = mpJan12()
        let tree: TreeNode? = TreeNode(1, TreeNode(2, nil, TreeNode(5)), TreeNode(3))
        XCTAssertEqual(mp.binaryTreePaths(tree), ["1->2->5","1->3"])
    }
}
