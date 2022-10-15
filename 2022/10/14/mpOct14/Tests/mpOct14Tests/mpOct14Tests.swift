import XCTest
@testable import mpOct14

final class mpOct14Tests: XCTestCase {
    func testExample() throws {
        XCTAssertEqual(mpOct14().convertToTitle(1), "A")
        XCTAssertEqual(mpOct14().convertToTitle(28), "AB")
        XCTAssertEqual(mpOct14().convertToTitle(701), "ZY")
    }
}
