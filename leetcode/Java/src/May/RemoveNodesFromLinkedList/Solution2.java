package May.RemoveNodesFromLinkedList;

public class Solution2 {
    public ListNode removeNodes(ListNode head) {

        head = rev(head);

        ListNode curr = head;

        while(curr.next != null) {
            if(curr.val > curr.next.val) curr.next = curr.next.next;
            else curr = curr.next;
        }

        return rev(head);
    }

    private ListNode rev(ListNode head){

        ListNode curr = head;
        ListNode temp = null;

        while(curr != null){

            curr = curr.next;
            head.next = temp;
            temp = head;
            head = curr;
        }

        return temp;
    }
}
