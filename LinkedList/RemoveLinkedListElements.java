/**
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
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
    public ListNode removeElements(ListNode head, int val) {
         if (head == null)
            return null;
        
        //skip if head start with val
        while (head !=null && head.val == val){
            head = head.next;
        }
        
        ListNode result = head;
        
        while (head != null && head.next != null){
            // skip when next node is val
            if (head.next.val == val) {
                head.next = head.next.next;
            }
            else {
                head = head.next;
            }
        }
        return result;        
    }
}