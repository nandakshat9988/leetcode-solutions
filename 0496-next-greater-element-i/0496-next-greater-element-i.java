import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> m = new HashMap<>();
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < nums2.length; i++) {
            int num = nums2[i];
            while (!s.isEmpty() && num > s.peek()) {
                m.put(s.pop(), num); // assign next greater
            }
            s.push(num);
        }

        // Remaining elements in stack have no greater element
        while (!s.isEmpty()) {
            m.put(s.pop(), -1);
        }

        int[] arr = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            arr[i] = m.get(nums1[i]);
        }
        return arr;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna