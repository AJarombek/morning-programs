/**
 * https://leetcode.com/problems/crawler-log-folder/
 * @author Andrew Jarombek
 * @since 12/5/2021
 */

public class CrawlerLogFolder {
    public int minOperations(String[] logs) {
        int depth = 0;

        for (String log : logs) {
            if (log.equals("./")) {
                continue;
            } else if (log.equals("../")) {
                depth = Math.max(depth - 1, 0);
            } else {
                depth++;
            }
        }

        return depth;
    }
}
