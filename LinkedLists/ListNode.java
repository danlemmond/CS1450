package linkedlists;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {
        this(0, null);
    }
    public ListNode(int data) {
        this(data, null);
    }
    public ListNode(int data, ListNode next) {
        this.val = data;
        this.next = next;
    }
}