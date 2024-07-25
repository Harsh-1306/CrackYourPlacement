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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode node=temp;
        while(node.next!=null)
        {
            if(node.next.val==val)
            {
                node.next=node.next.next;
            }
            else
            {
                node=node.next;
            }
        }
        return temp.next;
    }
}