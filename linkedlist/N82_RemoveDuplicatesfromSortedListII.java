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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode pre = dummy;
        ListNode cur = pre.next;
        ListNode then;
        
        while(cur != null){
            
            then = cur.next;
            boolean dup = false;
            while(then != null && cur.val == then.val){
                pre.next = then;
                cur = then;
                then = then.next;
                dup = true;
            }
            
            if(dup){
                pre.next = then;
            }else{
                pre = cur;
            }
            
            cur = then;
        }
        
        return dummy.next;
    }
}