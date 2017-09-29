package linkedlists;


public class main {
    public static void main(String []args) {
        ListNode node5 = new ListNode(50);
        ListNode node4 = new ListNode(40, node5);
        ListNode node3 = new ListNode(30, node4);
        ListNode node2 = new ListNode(20, node3);
        ListNode node1 = new ListNode(10, node2);

        example.reverseList(node1);
    }
}