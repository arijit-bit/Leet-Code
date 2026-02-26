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
    public boolean isPalindrome(ListNode head) {
        ListNode tail;
        ArrayList arr = new ArrayList <>();
        tail = head;
        while(tail != null){
            arr.add(tail.val);
            tail = tail.next;
        }
        System.out.println(arr.toString());
        for(int i = arr.size()-1; i>=0; i--){
            int v = (int)arr.get(i);
            if(v != head.val){
                return false;
            }
            head = head.next;
        }

    return true;
    }
}