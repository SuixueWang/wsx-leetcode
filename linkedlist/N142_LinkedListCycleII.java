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
 
//  First Step:
// Assume the first pointer runs from head at a speed of 1-by-1 step, as S, and the second pointer runs at a speed of 2-by-2 step, as 2S, then two pointers will meet at MEET-POINT, using the same time. Define outer loop is A, the distance from CIRCLE-START-POINT to MEET-POINT is B, and the distance from MEET-POINT to CIRCLE-START-POINT is C (Apparently, C=loop-B), then (n*loop+a+b)/2S = (a+b)/S, n=1,2,3,4,5,....

// Converting that equation can get A/S=nloop/S-B/S. Since C=loop-B, get A/S = ((n-1)loop+C)/S.

// That means, as second step, assuming a pointer running from head and another pointer running from MEET-POINT both at a speed S will meet at CIRCLE-START-POINT;
 
//      (CIRCLE-START-POINT)
//             |
// -------A----@----------------
//             |               |
//             |               |
//             C               B
//             |               |
//             |-------@-------|
//                     |
//               (MEET-POINT)
 
 
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head == null || head.next == null) return null;
        if(head.next == head) return head;
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null){
            if(fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }else{
                return null;
            }
            
            if(fast == slow){
                break;
            }
        }
        
        
        //有理论依据,将slow放在头部,然后slow和fast按相同的速度走,则两者相遇的位置就是环的起始位置
        if(fast == null) return null;
        slow = head;
        while(slow != fast){
            fast = fast.next;
            slow = slow.next;
        }
        
        return slow;
    }
}