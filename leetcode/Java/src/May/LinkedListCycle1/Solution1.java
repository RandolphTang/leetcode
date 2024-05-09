package May.LinkedListCycle1;

public class Solution1 {
    public boolean hasCycle(ListNode head) {
        ListNode[] arr = new ListNode[10002];
        int count = 0;

        while(head != null && head.next != null){
            if(count > 10000) return true;
            arr[count++] = head;
            head = head.next;
        }

        return false;

    }
}
