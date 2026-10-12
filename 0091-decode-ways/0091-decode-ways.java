class Solution {
    public int numDecodings(String s) {
        if (s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int count = 1;
        int prev = 1;

        for (int i = 1; i < s.length(); i++) {
            int curr = 0;

            // Single digit
            if (s.charAt(i) != '0') {
                curr += count;
            }

            // Two digit
            int num = Integer.parseInt(s.substring(i - 1, i + 1));

            if (num >= 10 && num <= 26) {
                curr += prev;
            }

            prev = count;
            count = curr;

            if (count == 0) {
                return 0;
            }
        }

        return count;
    }
}