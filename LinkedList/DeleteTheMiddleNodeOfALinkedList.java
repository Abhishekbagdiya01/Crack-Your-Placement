/**
 * DeleteTheMiddleNodeOfALinkedList
 */
public class DeleteTheMiddleNodeOfALinkedList {

  public static ListNode deleteMiddle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    ListNode prev = null;
    if (head.next == null)
      return null;
    while (fast != null && fast.next != null) {
      prev = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    prev.next = slow.next;

    return head;
  }

  public static void main(String[] args) {
    ListNode listNode = new ListNode(1,
        new ListNode(2, new ListNode(3, new ListNode(4))));
    listNode.printListNode(listNode);
    ListNode result = deleteMiddle(listNode);
    result.printListNode(result);
  }
}
