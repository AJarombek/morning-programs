/**
 * https://leetcode.com/problems/path-crossing/
 * @author Andrew Jarombek
 * @since 11/28/2021
 */

import java.util.HashSet;
import java.util.Set;

public class PathsCrossing {
    public boolean isPathCrossing(String path) {
        Set<String> locations = new HashSet<>();
        locations.add("0,0");
        int x = 0;
        int y = 0;

        for (char c : path.toCharArray()) {
            switch (c) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }

            String location = x + "," + y;

            if (locations.contains(location)) {
                return true;
            }

            locations.add(location);
        }

        return false;
    }
}
