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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null)
            return null;
        if(l1==null&&l2!=null)
            return l2;
        if(l2==null&&l1!=null)
            return l1;
        ListNode ans = new ListNode();
        ListNode head = ans;
        while(l1!=null&&l2!=null)
        {
            if(l1.val==l2.val)
            {
                ListNode temp1 = new ListNode(l1.val);
                ListNode temp2 = new ListNode(l1.val);
                temp1.next=temp2;
                temp2.next=null;
                ans.next=temp1;
                l1=l1.next;
                l2=l2.next;
                ans=ans.next;
            }
            else if(l1.val<l2.val)
            {
                ListNode temp = new ListNode(l1.val);
                temp.next=null;
                ans.next=temp;
                l1=l1.next;
            }
            else
            {
                ListNode temp = new ListNode(l2.val);
                temp.next=null;
                ans.next=temp;
                l2=l2.next;
            }
            ans=ans.next;
        }
        while(l1!=null)
        {
            ListNode temp = new ListNode(l1.val);
            temp.next=null;
            ans.next=temp;
            l1=l1.next;
            ans=ans.next;
        }
        while(l2!=null)
        {
            ListNode temp = new ListNode(l2.val);
            temp.next=null;
            ans.next=temp;
            l2=l2.next;
            ans=ans.next;
        }
        return head.next;
    }
}