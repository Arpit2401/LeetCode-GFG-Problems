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
   public ListNode rev(ListNode head)
{
ListNode curr=head,prev=null,next=null;
while(curr!=null)
{

        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    return prev;
}
public ListNode reverseBetween(ListNode head, int left, int right) {
    if(left==right)
        return head;
    ListNode l=null,r=null,curr=head;
    int c=0;
    while(curr!=null)
    {
        c++;
        if(c==left)
         break;
        l=curr;
        curr=curr.next;
    }
    ListNode lt=curr;
   while(curr!=null)
    {
       
        if(c==right)
            break;
        c++;
        curr=curr.next;
    }
  
    r=curr.next;
     curr.next=null;
   lt=rev(lt);
   if(l==null)
       head=lt;
    else
        l.next=lt;
          while(lt.next!=null)
         {
               lt=lt.next;
          }
    lt.next=r;
    
    return head;
    
    
}
}