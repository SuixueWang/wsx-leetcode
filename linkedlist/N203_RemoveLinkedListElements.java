
// 分析：

// 1. 对于链表，在删除当前节点时，需要知道当前节点的父节点。

// 2. 对于非头节点，删除操作很方便，对于头节点需要额外的操作，为了在遍历的过程中，保持删除操作的一致性和避免区分头节点和非头节点，有两种方法来避免这种麻烦：

// ①可以为链表设置辅助头节点（即在原来链表前插入头节点），这样对具有辅助头节点的链表，在遍历时就不存在区分头节点和非头节点的问题。

// The key to solve this problem is using a helper node to track the head of the list.

// ②从头节点的下一个节点开始遍历查找删除，遍历完成后再处理头节点。


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        if (head == null) return null;  
        ListNode pointer = head;  
        while (pointer.next != null) {  
            if (pointer.next.val == val) pointer.next = pointer.next.next;  
            else pointer = pointer.next;  
        }  
        return head.val == val ? head.next : head;  
        
    }
}