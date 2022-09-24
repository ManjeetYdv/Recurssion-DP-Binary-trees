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
    
     public boolean helper(TreeNode root , int currSum , int target){
        
        if(root==null) return false;
        
        currSum+=root.val;
        if(root.left==null && root.right==null){
            if(currSum==target) return true;
        }
        
        if(helper(root.left , currSum , target)) return true;
        if(helper(root.right , currSum , target)) return true;
        
        return false;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
            return helper(root , 0 , targetSum);
    }
}
