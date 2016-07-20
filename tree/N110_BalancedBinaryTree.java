/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public int depth(TreeNode node){
        if(node == null) return 0;
        
        int l = depth(node.left);
        int r = depth(node.right);
        
        return l > r ? l+1 : r+1;
    }
    
    public boolean isBalanced(TreeNode root) {

        if(root == null) return true;
        
        int diff = Math.abs(depth(root.left) - depth(root.right));
        if(diff > 1){
            return false;
        }else{
            boolean leftBalanced = isBalanced(root.left);
            boolean rightBalanced = isBalanced(root.right);
            
            return leftBalanced && rightBalanced;
        }
        
    }
    
}