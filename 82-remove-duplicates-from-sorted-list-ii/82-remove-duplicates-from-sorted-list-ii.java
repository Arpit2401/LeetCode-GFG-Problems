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
        if(head==null)
            return null;
        ListNode curr = head ;
        ListNode prev = null;
        while(curr != null){
            boolean isSame = false;
            while(curr.next != null && curr.val == curr.next.val){
                curr = curr.next; 
                isSame = true;
            }
            if(isSame)
            {
                if(prev != null)
                    prev.next = curr.next;
            }
            else
            {
                if(prev == null)
                    head = curr; 
                prev = curr;
            }
            curr = curr.next; 
        }
        return prev == null ? null : head; 
    }
}