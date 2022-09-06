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
   
    
    public TreeNode pruneTree(TreeNode root) {
        

       
        if(root==null) return null;
        
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
            
        if(root.left==null && root.right==null && root.val==0) return null;
        else return root;
        
        
    }
}


//Tedha h pr mera h :(
class Solution {
    
     public static boolean helper(TreeNode root , TreeNode parent ){


        if(root==null) return false;

        boolean left = helper(root.left , root );
        boolean right = helper(root.right , root);

        if(left== false && right==false && root.val==0) {

            if(parent.left==root){
                parent.left=null;
            }
            else if(parent.right==root){
                parent.right =null;
            }
        }
        
        if(root.val==1){
            return true;
        }
        
        return left || right;

    }
    public TreeNode pruneTree(TreeNode root) {
        
        boolean var = helper(root, root);
        
        if(var==false) return null;

        return root;
        
    }
}
