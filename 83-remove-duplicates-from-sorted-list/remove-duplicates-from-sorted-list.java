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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        if(head.next == null) return head;
        ListNode dummy = head, curr = head.next;
        while(curr != null){
            if(dummy.val != curr.val){
                dummy.next = curr;
                dummy = curr;
            }
               curr = curr.next;
        }
        dummy.next = null;
        return head;
    }
}