class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];       // current subarray sum
        int maxSum = nums[0];    // best sum found so far

        for (int i = 1; i < nums.length; i++) {
            // either extend the current subarray or start fresh at nums[i]
            sum = Math.max(nums[i], sum + nums[i]);
            // update max if needed
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna