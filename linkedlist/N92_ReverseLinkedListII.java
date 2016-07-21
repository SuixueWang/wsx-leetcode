/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pivot1 = dummy;
        
        //第一步,先移动到翻转片段的前驱
        for(int i=1;i<m;i++){
            pivot1 = pivot1.next;
        }
        
        //第二步,设置翻转部分的头节点,当前节点和frontier节点(暂时使用),值得注意的是pivot1.next = null;
        head = pivot1.next;
        ListNode pivot2 = pivot1.next;
        pivot1.next = null;      //注意这一步,切断与前面片段的联系,免得藕断丝连
        
        ListNode frontier = null;
        
        for(int i = m; i < n; i++){
            frontier = pivot2.next;
            pivot2.next = pivot2.next.next;
            frontier.next = head;
            head = frontier;
            
        }

        pivot1.next = head; //前后片段连接
        
        
        return dummy.next;
    }
}


