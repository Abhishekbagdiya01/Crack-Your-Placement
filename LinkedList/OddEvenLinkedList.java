public class OddEvenLinkedList {
  public static ListNode oddEvenLinkedList(ListNode head) {
    ListNode oddIndex = new ListNode();
    ListNode oddIndexCopy = oddIndex;
    ListNode evenIndex = new ListNode();
    ListNode evenIndexCopy = evenIndex;

    int i = 1;
    while (head != null) {
      ListNode node = new ListNode();
      if (i % 2 == 0) {
        node.val = head.val;
        evenIndex.next = node;
        evenIndex = evenIndex.next;
      } else {
        node.val = head.val;
        oddIndex.next = node;
        oddIndex = oddIndex.next;
      }
      i++;
      head = head.next;
    }
    oddIndex.next = evenIndexCopy.next;
    return oddIndexCopy.next;
  }

  public static void main(String[] args) {
    ListNode listNode = new ListNode(1,
        new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
    ListNode result = oddEvenLinkedList(listNode);
    listNode.printListNode(listNode);
    result.printListNode(result);

  }
}
