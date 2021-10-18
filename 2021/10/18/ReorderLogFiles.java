/**
 * https://leetcode.com/problems/reorder-data-in-log-files/
 * @author Andrew Jarombek
 * @since 10/18/2021
 */

import java.util.Arrays;

public class ReorderLogFiles {
    public static String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (s1, s2) -> {
            String a = s1.split(" ")[1];
            String b = s2.split(" ")[1];

            int x = a.matches("^[0-9]+$") ? 1 : 0;
            int y = b.matches("^[0-9]+$") ? 1 : 0;

            if (x + y == 0) {
                a = s1.substring(s1.indexOf(" "));
                b = s2.substring(s2.indexOf(" "));

                int value = a.compareTo(b);

                if (value == 0) {
                    a = s1.substring(0, s1.indexOf(" "));
                    b = s2.substring(0, s2.indexOf(" "));

                    return a.compareTo(b);
                }

                return value;
            }

            return x - y;
        });

        return logs;
    }

    public static void main(String... args) {
        String[] logFiles = new String[] {"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"};
        reorderLogFiles(logFiles);
    }
}
