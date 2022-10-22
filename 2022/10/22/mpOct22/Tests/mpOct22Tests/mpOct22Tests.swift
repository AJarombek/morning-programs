import XCTest
@testable import mpOct22

final class mpOct22Tests: XCTestCase {
    func testExample() throws {
        let mp = mpOct22()
        var list = ListNode(1, ListNode(2, ListNode(2, ListNode(1))))
        XCTAssertTrue(mp.isPalindrome(list))

        list = ListNode(1, ListNode(2, ListNode(1)))
        XCTAssertTrue(mp.isPalindrome(list))

        list = ListNode(1, ListNode(2, ListNode(1, ListNode(2))))
        XCTAssertFalse(mp.isPalindrome(list))
    }
}
