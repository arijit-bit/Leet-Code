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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(-1);
        ListNode current = ans;
        //---just for understanding---\\
        // here ans contains one node with value -1 and current.val = -1
        // each case we have to create new node of ans and assign the value of list1 or list2
        // insted of we attach exiting node of list1 or list2 with the answer
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
            
        }
        while(list1 != null){
            current.next = list1;
            list1 = list1.next;
            current = current.next;
        }
        while(list2 != null){
            current.next = list2;
            list2 = list2.next;
            current = current.next;
            
        }
        return ans.next;
    }
}