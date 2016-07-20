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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(inorder.length == 0){
                return null;
        }
        
        TreeNode treeNode = createTree(inorder,0,inorder.length-1,  preorder,0,preorder.length-1);
        
        return treeNode;
    }

    public TreeNode createTree(int[] inorder, int inStart, int inEnd, int[] preorder, int preStart, int preEnd) {
        // TODO Auto-generated method stub
        if(inStart > inEnd){
            return null;
        }
        
        int root = preorder[preStart];
        
        int index = 0;
        
        for(int i = 0; i < inorder.length; i++){
            if(inorder[i] == root){
                index = i;
                break;
            }
        }
        
        int len = index - inStart;
        
        TreeNode left = createTree(inorder,inStart,index - 1,  preorder,preStart + 1, preStart + len);
        TreeNode right = createTree(inorder,index + 1, inEnd,  preorder,preStart + len+1, preEnd);                             
        
        TreeNode node = new TreeNode (root);
        node.left = left;
        node.right = right;
        
        
        return node;
    } 

}