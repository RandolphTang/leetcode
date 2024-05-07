package May.DoubleANumberRepresentedasALinkedList;

public class Solution2 {
    public ListNode doubleIt(ListNode head) {
        ListNode head1 = new ListNode();
        head1.next = head;

        ListNode left = head1;
        ListNode right = head;

        while(right != null){
            left.val = right.val * 2 >= 10? left.val + 1 : left.val;

            right.val = right.val * 2 % 10;

            left = left.next;
            right = right.next;
        }

        return head1.val > 0 ? head1 : head;
    }
}
