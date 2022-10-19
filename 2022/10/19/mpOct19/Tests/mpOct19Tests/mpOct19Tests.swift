import XCTest
@testable import mpOct19

final class mpOct19Tests: XCTestCase {
    func testExample() throws {
        let mp = mpOct19()
        XCTAssertTrue(mp.containsNearbyDuplicate([1, 2, 3, 1], 3))
        XCTAssertTrue(mp.containsNearbyDuplicate([1, 0, 1, 1], 1))
        XCTAssertFalse(mp.containsNearbyDuplicate([1, 2, 3, 1, 2, 3], 2))

        var queue = Queue<Int>()
        XCTAssertNil(queue.head)
        XCTAssertNil(queue.dequeue())
    }
}
