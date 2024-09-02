public class DeleteNodeInaLinkedList {
  public static void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
  }

  public static void main(String[] args) {

    ListNode list = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))));

    list.printListNode(list);
    deleteNode(list);
    list.printListNode(list);
  }
}
