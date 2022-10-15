import XCTest
@testable import mpOct15

final class mpOct15Tests: XCTestCase {
    func testExample() throws {
        let mp = mpOct15()
        XCTAssertEqual(mp.majorityElement([3, 2, 3]), 3)
        XCTAssertEqual(mp.titleToNumber("A"), 1)
    }
}
