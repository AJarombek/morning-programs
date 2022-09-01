/*
 * https://leetcode.com/problems/most-visited-sector-in-a-circular-track/
 * @author Andrew Jarombek
 * @since 8/31/2022
 */

import java.util.ArrayList;
import java.util.List;

public class MostVisitedSector {
    public static List<Integer> mostVisited(int n, int[] rounds) {
        int start = rounds[0];
        int end = rounds[rounds.length - 1];

        List<Integer> list = new ArrayList<>();

        if (end >= start) {
            int index = start;

            while (index <= end) {
                list.add(index);
                index++;
            }
        } else {
            int index = 1;

            while (index <= end) {
                list.add(index);
                index++;
            }

            index = start;

            while (index <= n) {
                list.add(index);
                index++;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        List<Integer> result = mostVisited(4, new int[]{1, 3, 1, 2});
        assert result.get(0) == 1;
        assert result.get(1) == 2;
        assert result.size() == 2;
    }
}
