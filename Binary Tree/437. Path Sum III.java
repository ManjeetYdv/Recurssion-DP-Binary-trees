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
    
    private int ans = 0;
    public int pathSum(TreeNode root, int sum) {
        
        if(root == null) return 0;
        helper(root, sum);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return ans;
    }

    public void helper(TreeNode root, int sum) {
        if (root == null || root.val == Math.pow(10,9)) return;
        sum = sum-root.val;
        if (sum ==0) ans++;
        helper(root.left, sum);
        helper(root.right, sum);
    }

    
}
