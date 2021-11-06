/**
 * https://leetcode.com/problems/reformat-date/
 * @author Andrew Jarombek
 * @since 11/6/2021
 */

import java.util.HashMap;
import java.util.Map;

public class ReformatDate {
    public String reformatDate(String date) {
        Map<String, String> months = new HashMap<>();
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");

        String[] parts = date.split(" ");

        StringBuilder result = new StringBuilder();

        result.append(parts[2]);
        result.append('-');
        result.append(months.get(parts[1]));
        result.append('-');

        String day = parts[0].substring(0, parts[0].length() - 2);

        if (day.length() == 1) {
            day = "0" + day;
        }

        result.append(day);

        return result.toString();
    }
}
