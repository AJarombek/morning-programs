/**
 * https://leetcode.com/problems/destination-city/
 * @author Andrew Jarombek
 * @since 11/24/2021
 */

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestCity {
    public String destCity(List<List<String>> paths) {
        Set<String> start = new HashSet<>();
        Set<String> dest = new HashSet<>();

        for (List<String> path : paths) {
            start.add(path.get(0));
            dest.add(path.get(1));
        }

        dest.removeAll(start);

        for (String str : dest) {
            return str;
        }

        return null;
    }
}
