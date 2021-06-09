/**
Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. 
If the two linked lists have no intersection at all, return null.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode listA = headA;
        ListNode listB = headB;
        int countA = 0, countB = 0;
        
        while(listA != null){
            countA++;
            listA = listA.next;
        }
        while(listB != null){
            countB++;
            listB = listB.next;
        }
        
        int diff = Math.abs(countA - countB);
        
        if(countA > countB){
            for(int i = 0; i < diff; i++){
                headA = headA.next;
            }
        }
        else{
            for(int i = 0; i < diff; i++){
                headB = headB.next;
            }
        }
        
        while(headA != null && headB != null){
            if(headA == headB)
                return headA;
            else{
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
        
        
    }
}