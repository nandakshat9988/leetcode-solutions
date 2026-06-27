class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(
                (b[0] + b[1]),
                (a[0] + a[1])
            )
        ); // Max Heap

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {

                int[] pair = new int[]{nums1[i], nums2[j]};

                if (pq.size() < k) {
                    pq.add(pair);
                } else if (pair[0] + pair[1] < pq.peek()[0] + pq.peek()[1]) {
                    pq.poll();
                    pq.add(pair);
                } else {
                    break; // nums2 is sorted, further sums will be larger
                }
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        while (!pq.isEmpty()) {
            int[] pair = pq.poll();
            result.add(Arrays.asList(pair[0], pair[1]));
        }

        Collections.reverse(result); // smallest first
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna