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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||head.next==null)
            return null;
        int len = 0;
        ListNode start = head;
        ListNode temp = head;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        len = len-n;
        if(len==0)
            return start.next;
        temp = head.next;
        while(len-->1)
        {
            head=head.next;
            temp=temp.next;
        }
        head.next=temp.next;
        return start;
    }
}