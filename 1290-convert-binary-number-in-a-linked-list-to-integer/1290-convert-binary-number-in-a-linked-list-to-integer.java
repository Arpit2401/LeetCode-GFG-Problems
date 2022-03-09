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
    public int getDecimalValue(ListNode head) {
        int l = 0;
        ListNode curr = head;
        while(curr.next!=null)
        {
            l++;
            curr=curr.next;
        }
        curr=head;
        int num = 0;
        while(curr!=null)
        {
            num+=curr.val*(int)Math.pow(2,l--);
            curr=curr.next;
        }
        return num;
    }
}