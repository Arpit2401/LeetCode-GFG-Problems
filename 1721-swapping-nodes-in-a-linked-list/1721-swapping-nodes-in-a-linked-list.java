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
    public ListNode swapNodes(ListNode head, int k) {
        int len = 0,x=0,y=0,i=0;
        ListNode temp = head;
        while(temp!=null)
        {
            len++;
            if(len==k)
                x = temp.val;
            temp=temp.next;
        }
        temp = head;
        while(temp!=null)
        {
            i++;
            if(i==len-k+1)
            {
                y = temp.val;
                temp.val = x;
            }
            temp=temp.next;
        }
        i=1;
        temp=head;
        while(i++<k)
            temp=temp.next;
        temp.val=y;
        return head;
    }
}