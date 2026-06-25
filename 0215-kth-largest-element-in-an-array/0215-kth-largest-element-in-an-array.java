import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Min-heap
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            heap.add(num);
            if (heap.size() > k) {
                heap.poll(); // remove smallest
            }
        }

        return heap.peek(); // kth largest
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna