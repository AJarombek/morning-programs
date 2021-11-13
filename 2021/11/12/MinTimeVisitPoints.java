/**
 * https://leetcode.com/problems/minimum-time-visiting-all-points/
 * @author Andrew Jarombek
 * @since 11/12/2021
 */

public class MinTimeVisitPoints {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;

        for (int i = 1; i < points.length; i++) {
            time += Math.max(Math.abs(points[i][0] - points[i-1][0]), Math.abs(points[i][1] - points[i-1][1]));
        }

        return time;
    }
}
