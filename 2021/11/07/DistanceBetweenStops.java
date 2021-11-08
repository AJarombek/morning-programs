/**
 * https://leetcode.com/problems/distance-between-bus-stops/
 * @author Andrew Jarombek
 * @since 11/7/2021
 */

public class DistanceBetweenStops {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int forwardValue = 0;
        int reverseValue = 0;
        int forwardIndex = start;
        int reverseIndex = start - 1 >= 0 ? start - 1 : distance.length - 1;

        while (forwardIndex != destination) {
            forwardValue += distance[forwardIndex];
            forwardIndex = (forwardIndex + 1) % distance.length;
        }

        while (reverseIndex != (destination - 1 >= 0 ? destination - 1 : distance.length - 1)) {
            reverseValue += distance[reverseIndex];
            reverseIndex = reverseIndex - 1 >= 0 ? reverseIndex - 1 : distance.length - 1;
        }

        return Math.min(forwardValue, reverseValue);
    }
}
