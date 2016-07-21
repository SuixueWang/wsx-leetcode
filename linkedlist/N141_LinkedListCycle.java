/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        // if(head == null) return false;
        // if(head.next == head) return true;
        
        // ListNode p1 = head;
        // ListNode p2 = head;
        
        // while(p1.next != null && p2 != null && p2.next != null){
            
        //     p1 = p1.next;
        //     p2 = p2.next.next;
        //     if(p1 == p2){
        //         return true;
        //     }
        // }
        
        // return false;
        
        if(head == null || head.next == null) return false;
        if(head.next == head) return true;
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null){
            if(fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }else{
                return false;
            }
            
            if(fast == slow){
                return true;
            }
        }
        
        return false;

        // -----------------------------------------------------
        
        
        
        
    }
}