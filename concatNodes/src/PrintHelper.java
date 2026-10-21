public class PrintHelper {
    public static void printList(ListNode node,
                                 String sep) {
        if (node == null) return;
        System.out.print(node.val);
        if (node.next != null) {
            System.out.print(sep);
        }
        printList(node.next,
                sep);
    }
}
