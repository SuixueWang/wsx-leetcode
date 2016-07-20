/**
 * Definition for a binary tree node.
*/

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
} 
 
public class Solution {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        if(inorder.length == 0 || postorder.length == 0) return null;   
        
        TreeNode root = createTree(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
        
        return root;
    }
    
    public TreeNode createTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd){
        
        if(inStart > inEnd) return null;
        
        int root = postorder[postEnd]; //根据后序的最后一个值确定根节点
        
        //找出根节点在中序里的位置
        int index = 0;
        for(int i = 0; i < inorder.length; i++){
            if(inorder[i] == root){
                index = i;
                break;
            }
        }
        
        int len = index - inStart;
        
        TreeNode left  = createTree(inorder, inStart, index-1, postorder, postStart, postStart+len-1);
        TreeNode right = createTree(inorder, index+1, inEnd, postorder, postStart+len, postEnd-1);
        
        TreeNode node = new TreeNode(root);
        node.left = left;
        node.right = right;
        
        return node;
        
    }

}