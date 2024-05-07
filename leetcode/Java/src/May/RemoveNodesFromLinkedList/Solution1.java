package May.RemoveNodesFromLinkedList;

public class Solution1 {
    public ListNode removeNodes(ListNode head) {
        if(head == null) return head;

        head.next = removeNodes(head.next);

        return head.next != null && head.next.val > head.val ? head.next: head;
    }
}
