import XCTest
@testable import mpOct21

final class mpOct21Tests: XCTestCase {
    func testExample() throws {
        let mp = mpOct21()
        XCTAssertTrue(mp.isPowerOfTwo(1))
        XCTAssertTrue(mp.isPowerOfTwo(16))
        XCTAssertFalse(mp.isPowerOfTwo(3))
    }
}
