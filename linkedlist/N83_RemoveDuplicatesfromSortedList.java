/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null) return null;
        
        ListNode pivot = head;
        
        while(pivot != null){
            
            if(pivot.next != null && pivot.val == pivot.next.val){
                pivot.next = pivot.next.next;
                
            }else{
                pivot = pivot.next;
            }
        }
        
        
        return head;
    }
}