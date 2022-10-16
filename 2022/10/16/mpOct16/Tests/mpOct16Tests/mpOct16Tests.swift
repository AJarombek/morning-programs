import XCTest
@testable import mpOct16

final class mpOct16Tests: XCTestCase {
    func testExample() throws {
        let mp = mpOct16()
        XCTAssertEqual(mp.reverseBits(1), 2147483648)

        XCTAssertEqual(mp.hammingWeight(1), 1)
        XCTAssertEqual(mp.hammingWeight(3), 2)
        XCTAssertEqual(mp.hammingWeight(4), 1)
    }
}
