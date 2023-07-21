// 2095. Delete the Middle Node of a Linked List
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // Edge case: return nullptr if there is only one node.
        if (head.next == null)
            return null;
        
        // Initialize two pointers, 'slow' and 'fast'.
        ListNode slow = head, fast = head.next.next;
        
        // Let 'fast' move forward by 2 nodes, 'slow' move forward by 1 node each step.
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // When 'fast' reaches the end, remove the next node of 'slow' and return 'head'.
        slow.next = slow.next.next;
        return head;
    }
}

// my solution 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }

        if(slow == head)
            return null;

        if(slow.next != null){
        slow.val=slow.next.val;
        ListNode next=slow.next.next;
        slow.next.next=null;
        slow.next=next;
        }else {
            head.next=null;
        }
      
        return head;  
    }
}