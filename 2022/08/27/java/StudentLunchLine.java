/**
 * https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
 * @author Andrew Jarombek
 * @since 8/27/2022
 */

import java.util.*;

public class StudentLunchLine {
    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> available = new LinkedList<>();

        for (int sandwich : sandwiches)
            available.add(sandwich);

        int[] needed = new int[]{0, 0};

        for (int student : students) {
            needed[student]++;
        }

        while (available.size() > 0) {
            int val = available.poll();

            if (needed[val] == 0) {
                return needed[0] + needed[1];
            }

            needed[val]--;
        }

        return 0;
    }

    public static void main(String[] args) {
        assert countStudents(new int[] {1, 1, 0, 0}, new int[] {0, 1, 0, 1}) == 0;
        assert countStudents(
            new int[] {1, 1, 1, 0, 0, 1},
            new int[] {1, 0, 0, 0, 1, 1}
        ) == 3;
    }
}
