/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base cases
        if (p == null && q == null) {
            return true; // both trees are empty
        }
        if (p == null || q == null) {
            return false; // one is empty, the other is not
        }
        
        
        if (p.val != q.val) {
            return false; // values differ
        }

        // Recursive check for left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna