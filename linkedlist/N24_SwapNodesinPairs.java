/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public ListNode swapPairs(ListNode head) {
        
        if(head == null) return null;
        
        ListNode dummy = new ListNode(0);
        ListNode p1 = dummy; //第一个要交换节点的前一个节点
        ListNode p2 = head;  //第一个要交换节点
        
        //画草图容易理解
        while(p2 != null && p2.next != null){
            
            ListNode temp = p2.next.next;
            p2.next.next = p2;
            
            p1.next = p2.next;
            p2.next = temp;
            
            p1 = p2;
            p2 = p2.next;
        }
        
        return dummy.next;
        
        
    }
    
    
    // public ListNode swapPairs(ListNode head) {
        
    //     if(head == null) return null;
        
    //     ListNode dummy = new ListNode(0);
    //     dummy.next = head;
        
    //     while(head != null && head.next != null){
            
    //         swap(head, head.next);
            
    //         head = head.next.next;
    //     }
        
    //     return dummy.next;
        
        
    // }
    
    // public void swap(ListNode A, ListNode B){
        
    //     int temp = A.val;
    //     A.val = B.val;
    //     B.val = temp;
        
    // }
}