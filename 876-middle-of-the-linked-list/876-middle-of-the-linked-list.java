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
    public ListNode middleNode(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        len=len/2-1;
        while(head!=null&&len-->=0)
            head=head.next;
        return head;
    }
}