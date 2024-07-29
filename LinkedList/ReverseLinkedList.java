package LinkedList;

public class ReverseLinkedList {

     public static ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args) {
    ListNode ll = new ListNode(12, new ListNode(14));

    reverseList(ll);

    ll.traversInLinkedList();
    }
}
