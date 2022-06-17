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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null) {
            if(curr.val == val) {
                if(prev == null) {                 // if First node.val = val
                    head = head.next;
                    curr = head;
                }
                else {
                    prev.next = curr.next;
                    curr = curr.next;
                }
            }
            else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}