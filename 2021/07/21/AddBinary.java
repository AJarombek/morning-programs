/**
 * https://leetcode.com/problems/add-binary/
 * Tough 5000m race on the track.  I'm pretty slow right now.
 * @author Andrew Jarombek
 * @since 7/21/2021
 */

class AddBinary {
    public static String addBinary(String a, String b) {
        int maxLength = Math.max(a.length(), b.length());

        StringBuilder result = new StringBuilder();
        int carryOver = 0;

        for (int i = 0; i < maxLength; i++) {
            int aIndex = a.length() - 1 - i;
            int bIndex = b.length() - 1 - i;

            char aValue = i >= a.length() ? '0' : a.charAt(aIndex);
            char bValue = i >= b.length() ? '0' : b.charAt(bIndex);

            int aNumber = Character.getNumericValue(aValue);
            int bNumber = Character.getNumericValue(bValue);

            int totalNumber = aNumber + bNumber + carryOver;
            if (totalNumber == 3) {
                result.insert(0, "1");
                carryOver = 1;
            } else if (totalNumber == 2) {
                result.insert(0, "0");
                carryOver = 1;
            } else {
                result.insert(0, String.valueOf(totalNumber));
                carryOver = 0;
            }
        }

        if (carryOver == 1) {
            result.insert(0, "1");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        assert AddBinary.addBinary("1", "11").equals("100");
    }
}
