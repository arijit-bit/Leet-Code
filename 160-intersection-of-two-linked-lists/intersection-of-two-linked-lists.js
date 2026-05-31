/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} headA
 * @param {ListNode} headB
 * @return {ListNode}
 */
var getIntersectionNode = function(headA, headB) {
    let ptr1 = headA;
    while (ptr1 != null){
        let ptr2 = headB;
        while(ptr2 != null){
            if(ptr1===ptr2){
                return ptr1;

            }
            ptr2 = ptr2.next
        }
        
        ptr1 = ptr1.next;
        ptr2 = headB;
    }
    return null;
};