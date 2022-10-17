/**
 https://leetcode.com/problems/isomorphic-strings/
 - Author: Andrew Jarombek
 - Date: 10/17/2022
 */

public struct mpOct17 {
    func isIsomorphic(_ s: String, _ t: String) -> Bool {
        if s.count != t.count {
            return false
        }

        if s == t {
            return true
        }

        var set: Set<Character> = Set()
        var map: [Character: Character] = [:]

        for i in 0..<s.count {
            let sc = s[s.index(s.startIndex, offsetBy: i)]
            let tc = t[t.index(t.startIndex, offsetBy: i)]
            if map[sc] != nil {
                if map[sc] != tc {
                    return false
                }
            } else {
                if set.contains(tc) {
                    return false
                }

                map[sc] = tc
                set.insert(tc)
            }
        }

        return true
    }

    func isIsomorphicV1(_ s: String, _ t: String) -> Bool {
        if s.count != t.count {
            return false
        }

        if s == t {
            return true
        }

        var sourceMap: [Character: Int] = [:]

        for c in s {
            sourceMap[c] = (sourceMap[c] ?? 0) + 1
        }

        var targetMap: [Character: Int] = [:]

        for c in t {
            targetMap[c] = (targetMap[c] ?? 0) + 1
        }

        if sourceMap.count == targetMap.count {
            var matches = true

            for (key, value) in sourceMap {
                if targetMap[key] != value {
                    matches = false
                    break
                }
            }

            if matches {
                return false
            }
        }

        let sourceVals = Array(sourceMap.values).sorted(by: <)
        let targetVals = Array(targetMap.values).sorted(by: <)

        if sourceVals.count != targetVals.count {
            return false
        }

        for i in 0..<sourceVals.count {
            if sourceVals[i] != targetVals[i] {
                return false
            }
        }

        return true
    }

    func canBeRearranged(_ s: String, _ t: String) -> Bool {
        if s.count != t.count {
            return false
        }

        var map: [Character: Int] = [:]

        for c in s {
            map[c] = (map[c] ?? 0) + 1
        }

        for c in t {
            map[c] = (map[c] ?? 0) - 1
        }

        for (_, value) in map {
            if value != 0 {
                return false
            }
        }

        return true
    }
}
