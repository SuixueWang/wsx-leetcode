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
    
    List<Integer> results = new ArrayList<Integer>();
    
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) return results;
        
        recurPostTravesal(root);
        
        return results;
    }
    
    public void recurPostTravesal(TreeNode node){
        if(node.left != null){
            recurPostTravesal(node.left);
        }
        
        if(node.right != null){
            recurPostTravesal(node.right);
        }
        
        results.add(node.val);
        
    }
}