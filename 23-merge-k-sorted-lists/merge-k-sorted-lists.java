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
    public ListNode mergeKLists(ListNode[] lists) {
        
        
        int k = lists.length;
        
        System.out.println(k);
        int top = 0;
        int bottom  = k-1;

        

        if(lists.length == 0 ){
            return null;
        }
        while(bottom>0){
            top = 0;
            while(top < bottom){
                lists[top] = merge (lists[top], lists[bottom]);
                top++;
                bottom--;
            }
        }
        return lists[0];
    }
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(-1);
        ListNode Mp = ans;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                Mp.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                Mp.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            Mp = Mp.next;
        }
        while (l1 != null) {
            Mp.next = new ListNode(l1.val);
            l1 = l1.next;
            Mp = Mp.next;
        }

        while (l2 != null) {
            Mp.next = new ListNode(l2.val);
            l2 = l2.next;
            Mp = Mp.next;
        }
        return ans.next;

    }
}