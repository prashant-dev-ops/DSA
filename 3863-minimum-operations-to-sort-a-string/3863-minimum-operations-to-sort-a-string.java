class Solution {
    public int minOperations(String s) {
        int n = s.length();

        // Already sorted?
        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                sorted = false;
                break;
            }
        }
        if (sorted) return 0;

        // Unsorted with n == 2: only length-1 substrings are allowed
        if (n == 2) return -1;

        char mn = 'z', mx = 'a';
        int mnCount = 0, mxCount = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c < mn) { mn = c; mnCount = 1; }
            else if (c == mn) mnCount++;

            if (c > mx) { mx = c; mxCount = 1; }
            else if (c == mx) mxCount++;
        }

        char first = s.charAt(0), last = s.charAt(n - 1);

        // Sort s[1:] or s[:n-1]
        if (first == mn || last == mx) return 1;

        // First is the unique max and last is the unique min
        if (first == mx && mxCount == 1 && last == mn && mnCount == 1) return 3;

        return 2;
    }
}