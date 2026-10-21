void main() {
    Solution s = new Solution();

    List<Integer> list1 = new ArrayList<>(Arrays.asList(9,
            9,
            9,
            9,
            9,
            9,
            9));
    List<Integer> list2 = new ArrayList<>(Arrays.asList(9,
            9,
            9,
            9));

    ListNode l1 = createNodeList(list1);
    ListNode l2 = createNodeList(list2);

    PrintHelper.printList(s.addTwoNumbers(l1,
                    l2),
            " --> ");
}

public static ListNode createNodeList(List<Integer> list) {
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;
    for (int value : list) {
        current.next = new ListNode(value);
        current = current.next;
    }
    return dummy.next;
}