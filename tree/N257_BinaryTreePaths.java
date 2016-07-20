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
    
    //递归解法
    
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> results = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        
        if(root != null){
            getPaths(root, results, sb);
        }
        
        return results;
    }
    
    public void getPaths(TreeNode node, List<String> results, StringBuilder sb){
        
        if(node.left == null && node.right == null){
            sb.append(node.val);
            results.add(sb.toString());
            return;
        }
        
        sb.append(node.val);
        sb.append("->");
        
        int iniLen = sb.length();
        
        if(node.left != null){
            getPaths(node.left, results, sb);
        }
        
        sb.setLength(iniLen);
        
        if(node.right != null){
            getPaths(node.right, results, sb);
        }
        
    }
    
}