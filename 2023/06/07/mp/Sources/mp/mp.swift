/**
 https://leetcode.com/problems/construct-the-rectangle/
 - Author: Andrew Jarombek
 - Date: 6/7/2023
 */

import Foundation

public class MorningPrograms {
    func constructRectangle(_ area: Int) -> [Int] {
        var width = Int(sqrt(Double(area)))

        while area % width != 0 {
            width -= 1
        }

        return [area / width, width]
    }
}
