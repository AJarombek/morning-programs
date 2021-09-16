/**
 * @author Andrew Jarombek
 * @since 9/16/2021
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSum {
    // Miss you
    public String[] findMinimumIndexSum(String[] list1, String[] list2) {
        Map<String, Integer> itemPriority = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            itemPriority.put(list1[i], i);
        }

        List<String> result = new ArrayList<>();
        int lowestSum = list1.length + list2.length;

        for (int i = 0; i < list2.length; i++) {
            String item = list2[i];

            if (itemPriority.containsKey(item)) {
                int j = itemPriority.get(item);

                if (i + j == lowestSum) {
                    result.add(item);
                } else if (i + j < lowestSum) {
                    lowestSum = i + j;
                    result = new ArrayList<>();
                    result.add(item);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}
