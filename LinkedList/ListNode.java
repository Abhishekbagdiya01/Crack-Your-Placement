
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

  public void printListNode(ListNode listNode) {
    while (listNode != null) {
      if (listNode.next != null) {
        System.out.print(listNode.val + " -> ");
      } else {
        System.out.print(listNode.val + " ");
      }
      listNode = listNode.next;
    }
    System.out.println();
  }
}
