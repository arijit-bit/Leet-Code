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
        if(head==null) return null;
        ListNode temp1 = null;
        ListNode temp2 = null;
        while(head != null){
            temp2 = head.next;
            head.next = temp1;
            temp1 = head;
            head = temp2;
        }
    return temp1;
    }
}