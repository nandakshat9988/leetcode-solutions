import java.util.*;

class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];

        HashMap<Integer, Long> sum = new HashMap<>();
        HashMap<Integer, Integer> count = new HashMap<>();

        // Left to Right
        for (int i = 0; i < n; i++) {
            int x = nums[i];

            ans[i] += (long) count.getOrDefault(x, 0) * i
                    - sum.getOrDefault(x, 0L);

            count.put(x, count.getOrDefault(x, 0) + 1);
            sum.put(x, sum.getOrDefault(x, 0L) + i);
        }

        sum.clear();
        count.clear();

        // Right to Left
        for (int i = n - 1; i >= 0; i--) {
            int x = nums[i];

            ans[i] += sum.getOrDefault(x, 0L)
                    - (long) count.getOrDefault(x, 0) * i;

            count.put(x, count.getOrDefault(x, 0) + 1);
            sum.put(x, sum.getOrDefault(x, 0L) + i);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna