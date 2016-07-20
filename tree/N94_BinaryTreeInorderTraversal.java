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
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     List<Integer> results = new ArrayList<Integer>();
        
    //     if(root == null) return results;
        
    //     Stack<TreeNode> stack = new Stack<TreeNode>();
        
    //     TreeNode p = root;
        
    //     while(!stack.isEmpty() || p != null){
    //         if(p != null){
    //             stack.push(p);
    //             p = p.left;
    //         }else{
    //             TreeNode temp = stack.pop();
    //             results.add(temp.val);
    //             p = temp.right;
    //         }
    //     }
        
    //     return results;
    // }
    
    
    List<Integer> result = new ArrayList<Integer>();
 
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root !=null){
            helper(root);
        }
 
        return result;
    }
 
    public void helper(TreeNode p){
        if(p.left!=null)
            helper(p.left);
 
        result.add(p.val);
 
        if(p.right!=null)
            helper(p.right);
    }
}