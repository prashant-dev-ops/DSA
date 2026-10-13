
import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] squares = new long[n];

        for (int i = 0; i < n; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(squares);

        long ans = 0;

        for (int i = 0; i < n / 2; i++) {
            ans -= squares[i];
            ans += squares[n - 1 - i];
        }

        if (n % 2 != 0) {
            ans += squares[n / 2];
        }

        return ans;
    }
}
