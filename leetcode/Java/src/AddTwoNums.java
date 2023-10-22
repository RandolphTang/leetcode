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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // For this question, we need to consider when the sum carry to the next
        // position, which we use variable overFlow to represent the situation of carry

        // When carry does not happen, we use reminder to represent the sum in each position

        // Since both input are ListNode, we want to use two new ListNode to represent the current
        // result and final result

        // Some possible scenarios to consider for this question:
        // when the index of each ListNode does not match: 209 + 90987
        //          - Or condition, l1 != null || l2 != null
        // when both ListNodes add up but there is one more carry at the end
        //          - 2090 + 9000, then we must also consider when l1 and l2 both null
        //            the situation of overFlow > 0

        int sum = 0; // each position adds up
        int reminder = 0; // what is the sum of current digit
        int overFlow = 0; // when curren sum more than 10, values to add for next position
        ListNode head = null; // the final result ListNode
        ListNode temp = null; // the temporary ListNode to carry

        while (l1 != null || l2 != null || overFlow > 0) { // The three possible conditions

            sum = overFlow + (
                    ((l1 != null)? l1.val:0) +
                            ((l2 != null)? l2.val:0)
                    ); // if l1 and l2 have unmatched number of nodes, consider
                        // as 0 values to add

            reminder = sum % 10; // if sum less than 10, then normally adds to the position
            overFlow = sum / 10; // of sum greater than 10, then transfer the overFlow
                                    // to the next position
            ListNode current = new ListNode(reminder); // each position's value

            if (head == null) { // if current head has no nodes, initialize it
                head = current;
            } else { // if already occupie the first location
                temp = head; // reference nodes in head to temp
                while (temp.next != null) {
                    temp = temp.next; // continue to next nodes and continue calculation
                }

                temp.next = current;

                current.next = null; // not necessary, but good habits to maintain ListNode stability
            }

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        return head;

    }

}




