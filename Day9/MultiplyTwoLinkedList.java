class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long no1=0,no2=0,mod=(long)1e9+7;
        Node head1=first;
        Node head2=second;
        while(head1!=null)
        {
            no1=(no1*10+head1.data)%mod;
            head1=head1.next;
        }
        while(head2!=null)
        {
            no2=(no2*10+head2.data)%mod;
            head2=head2.next;
        }
        return (no1*no2)%mod;
    }
}
