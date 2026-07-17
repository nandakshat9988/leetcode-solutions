import java.util.*;
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0; // base case: empty tree
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna