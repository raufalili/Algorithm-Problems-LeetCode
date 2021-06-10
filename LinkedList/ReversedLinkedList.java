/**
Given the head of a singly linked list, reverse the list, and return the reversed list.
*/

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
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextElm = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nextElm;
        }
        return pre;
    }
}