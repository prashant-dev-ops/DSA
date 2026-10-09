class Solution {
    public int minInsertions(String s) {


        // simple and doable but due to time it was copy and paste

         int open = 0;
        int ans = 0;
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                open++;
                i++;
            } else {
                // Check whether next character is ')'
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i += 2;
                } else {
                    // Insert one ')' to make a pair
                    ans++;
                    i++;
                }

                // No opening bracket available
                if (open == 0) {
                    ans++;
                } else {
                    open--;
                }
            }
        }

        // Each unmatched '(' needs two ')'
        ans += open * 2;

        return ans;
    }
}
        
