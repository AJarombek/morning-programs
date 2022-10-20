import XCTest
@testable import mpOct20

final class mpOct20Tests: XCTestCase {
    func testExample() throws {
        let mp = mpOct20()
        let tree: TreeNode? = TreeNode(1, TreeNode(2), TreeNode(3))

        XCTAssertEqual(tree?.val, 1)
        XCTAssertEqual(tree?.left?.val, 2)
        XCTAssertEqual(tree?.right?.val, 3)

        let _ = mp.invertTree(tree)

        XCTAssertEqual(tree?.val, 1)
        XCTAssertEqual(tree?.left?.val, 3)
        XCTAssertEqual(tree?.right?.val, 2)

        let range1 = mp.summaryRanges([0,1,2,4,5,7])
        XCTAssertEqual(range1, ["0->2","4->5","7"])

        let range2 = mp.summaryRanges([0,2,3,4,6,8,9])
        XCTAssertEqual(range2, ["0","2->4","6","8->9"])
    }
}
