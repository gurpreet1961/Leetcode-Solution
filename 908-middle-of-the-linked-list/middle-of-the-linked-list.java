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
    public ListNode middleNode(ListNode head) {
        ListNode fast = head; //this traves 2step in every move
        ListNode slow = head; //this will traves only one time
        //so when my fast reaches last my slow will have only travel the half
        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
        
    }
}