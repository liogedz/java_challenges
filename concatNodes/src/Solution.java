public class Solution {
    public ListNode addTwoNumbers(ListNode l1,
                                  ListNode l2) {
        // creating node starting with zero value
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        int sum = 0; // using for sum and carry
        while (l1 != null || l2 != null) {

            if (l1 != null) sum += l1.val;
            if (l2 != null) sum += l2.val;

            // because first node is dummy, we assign remainder of sum value to res.next
            res.next = new ListNode(sum % 10);
            res = res.next;

            if (sum < 10) {
                sum = 0; // reset sum if it was less than 10
            } else {
                sum = 1; // or keep carry for next iteration value (one in memory for > 10)
            }
            if (l1 != null) l1 = l1.next; // traverse to next node
            if (l2 != null) l2 = l2.next;
        }
        if (sum == 1) { // if after last node we have 1 in carry memory,
            res.next = new ListNode(sum); // create another node to paste it there
        }
        return dummy.next;
    }
}
