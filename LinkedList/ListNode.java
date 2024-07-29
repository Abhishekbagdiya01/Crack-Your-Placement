package LinkedList;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void traversInLinkedList(){
        ListNode current = this;
        while (current != null) {
            System.out.println(current.val + "->");
            current=current.next;
        }
    }
}