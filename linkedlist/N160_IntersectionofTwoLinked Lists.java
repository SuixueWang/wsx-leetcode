/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        
        int lenA = calLength(headA);
        int lenB = calLength(headB);
        
        if(lenA > lenB){
            ListNode temp = headA;
            headA = headB;
            headB = temp;
            
            int len = lenA;
            lenA = lenB;
            lenB = len;
        }
        
        for(int i = 0; i< lenB - lenA; i++){
            headB = headB.next;
        }
        
        while(headA != null){
            
            if(headA == headB){
                return headA;
            }
            
            headA = headA.next;
            headB = headB.next;
        }
        
        return null;
        
    }
    
    public int calLength(ListNode head){
        
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        
        return len;
    }
}