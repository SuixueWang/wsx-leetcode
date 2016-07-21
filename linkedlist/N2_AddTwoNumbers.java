/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode result = new ListNode(0);
        ListNode head = result;
        
        int carry = 0;
        
        while(l1!=null && l2!=null){
            
            int sum = l1.val + l2.val + carry;
            
            ListNode temp = new ListNode(sum % 10);

            head.next = temp;
            head = head.next;
            
            carry = sum / 10;
            
            l1 = l1.next;
            l2 = l2.next;
            
        }
        
        ListNode l = (l1 != null) ? l1 : l2;
        while(l != null){
            int sum = l.val + carry;
            
            ListNode temp = new ListNode(sum % 10);

            head.next = temp;
            head = head.next;
            
            carry = sum / 10;
            
            l = l.next;
        }
        
        if(carry != 0){
            
            ListNode temp = new ListNode(1);

            head.next = temp;
        }
        
        return result.next;
    }
}