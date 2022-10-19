import XCTest
@testable import mpOct18

final class mpOct18Tests: XCTestCase {
    func testExample() throws {
        let mp = mpOct18()
        let list = ListNode(1, ListNode(2, ListNode(3)))

        var result = mp.reverseList(list)
        XCTAssertEqual(result?.val, 3)
        XCTAssertEqual(result?.next?.val, 2)
        XCTAssertEqual(result?.next?.next?.val, 1)
        XCTAssertNil(result?.next?.next?.next)

        result = mp.reverseListV2(list)
        XCTAssertEqual(result?.val, 3)
        XCTAssertEqual(result?.next?.val, 2)
        XCTAssertEqual(result?.next?.next?.val, 1)
        XCTAssertNil(result?.next?.next?.next)

        var array = [1, 2, 3, 1]
        XCTAssertTrue(mp.containsDuplicate(array))

        array = [1, 2, 3, 4]
        XCTAssertFalse(mp.containsDuplicate(array))
    }
}
