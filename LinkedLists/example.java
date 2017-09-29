package linkedlists;

public class example {
    public static void reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr;
        while (curr != null) {
            System.out.println(curr.val);
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        System.out.println(prev);
    }
}