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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        if(nums.length == 0 || nums == null) return null;
        
        TreeNode bst = recurBST(nums,0,nums.length-1);
        
        return bst;
    }
    
    public TreeNode recurBST(int [] nums, int start, int end){
        
        if(start > end) return null;
        
        int mid = (start + end)/2;
        TreeNode node = new TreeNode(nums[mid]);
        
        node.left = recurBST(nums, start, mid-1);
        node.right = recurBST(nums, mid+1, end);
        
        return node;
    }
}