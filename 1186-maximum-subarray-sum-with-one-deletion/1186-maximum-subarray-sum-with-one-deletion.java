class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        
        // Base cases
        int noDel = arr[0];  // Max subarray sum ending at i with NO deletions
        int oneDel = 0;      // Max subarray sum ending at i with ONE deletion
        int maxSum = arr[0];

        for (int i = 1; i < n; i++) {
            // Store the previous noDel before it gets overwritten
            int prevNoDel = noDel;

            // 1. Current element either starts a new subarray or extends the previous no-deletion subarray
            noDel = Math.max(arr[i], noDel + arr[i]);

            // 2. To have one deletion ending at i:
            //    - Either we delete the current element arr[i] (so we take prevNoDel)
            //    - Or we keep arr[i] and add it to a previous subarray that already has one deletion (oneDel + arr[i])
            oneDel = Math.max(prevNoDel, oneDel + arr[i]);

            // Update the global maximum
            maxSum = Math.max(maxSum, Math.max(noDel, oneDel));
        }

        return maxSum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna