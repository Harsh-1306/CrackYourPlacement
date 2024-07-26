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
    public ListNode reverseList(ListNode head) {
         if(head==null || head.next==null)
        {
            return head;
        }
        ListNode prev=null,pres=head,newnode=pres.next;
        while(pres!=null)
        {
            pres.next=prev;
            prev=pres;
            pres=newnode;
            if(newnode!=null)
            {
                newnode=newnode.next;
            }
        }
        head=prev;
        return head;
    }
}