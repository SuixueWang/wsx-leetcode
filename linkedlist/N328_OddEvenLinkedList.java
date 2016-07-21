/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null) return null;
        
        ListNode      odd = head;
        ListNode     even = head.next;
        ListNode   oddCur = odd;
        ListNode  evenCur = even;
        
        while(oddCur.next != null && evenCur.next != null){
            oddCur.next = evenCur.next;
            oddCur = oddCur.next;
            
            evenCur.next = oddCur.next;
            evenCur = evenCur.next;
        }

        oddCur.next = even;
        
        return odd;
        

    }
}