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
    public boolean hasPathSum(TreeNode root, int sum) {
        
        return pathSearch(root, sum);
    }

    public boolean pathSearch(TreeNode root, int sum){
        
        if(root == null) return false;
        
        if(root.left == null && root.right == null){
            if(sum - root.val == 0){
                return true;
            }else{
                return false;
            }
        }
        
        return pathSearch(root.left, sum - root.val) || pathSearch(root.right, sum - root.val);
    }
}