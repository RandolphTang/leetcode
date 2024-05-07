package May.DoubleANumberRepresentedasALinkedList;

public class Solution1 {
    public ListNode doubleIt(ListNode head) {
        if (head == null) return null;

        head = rev(head);
        boolean move = false;
        ListNode curr = head;

        while(curr != null){
            int sum = curr.val * 2 + (move ? 1 : 0);
            curr.val = sum % 10;
            move = sum >= 10 ? true:false;

            if (curr.next == null && move) {
                curr.next = new ListNode(1);
                break;
            }

            curr = curr.next;
        }

        return rev(head);
    }

    private ListNode rev(ListNode head){
        ListNode curr = null;
        ListNode temp = null;
        while(head != null){
            curr = head.next;
            head.next = temp;
            temp = head;
            head = curr;
        }

        return temp;
    }
}
