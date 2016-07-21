/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        
        if(head == null) return null;
        
        ListNode pLeft_head = new ListNode(0);
        ListNode pRight_head = new ListNode(0);
        
        ListNode  pLeft = pLeft_head;
        ListNode  pRight = pRight_head;
        
        while(head != null){
            if(head.val < x){
                pLeft.next = head;
                pLeft = head;
            }else{
                pRight.next = head;
                pRight = head;
            }
            
            head = head.next;
        }
        
        pLeft.next = pRight_head.next;
        pRight.next = null;
        
        return pLeft_head.next;
        
    }
}