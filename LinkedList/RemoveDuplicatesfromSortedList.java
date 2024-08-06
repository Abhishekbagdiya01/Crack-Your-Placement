public class RemoveDuplicatesfromSortedList {
  // https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
  public static ListNode deleteDuplicates(ListNode head) {
    if (head == null)
      return null;
    ListNode current = head;
    while (current.next != null) {

      if (current.val == current.next.val) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }

    return head;
  }

  public static void main(String[] args) {
    ListNode listNode = new ListNode(1,
        new ListNode(2, new ListNode(2, new ListNode(4, new ListNode(4, new ListNode(5))))));
    System.out.println("Original LinkedList");
    listNode.printListNode(listNode);
    System.out.println("Reversed LinkedList");
    ListNode newListNode = deleteDuplicates(listNode);
    newListNode.printListNode(newListNode);

  }
}
