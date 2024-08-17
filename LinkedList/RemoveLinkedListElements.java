import java.awt.List;

/**
 * RemoveLinkedListElements
 * https://leetcode.com/problems/remove-linked-list-elements/description/
 */
public class RemoveLinkedListElements {

  public static ListNode removeElements(ListNode head, int val) {
    ListNode dummy = new ListNode();
    ListNode newList = dummy;
    while (head != null) {
      if (head.val != val) {
        newList.next = head;
        newList = newList.next;
      }
      head = head.next;

    }
    newList.next = null;
    return dummy.next;
  }

  public static void main(String[] args) {
    ListNode listNode = new ListNode(1,
        new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
    System.out.println("Original list");
    listNode.printListNode(listNode);
    ListNode removeElementsList = removeElements(listNode, 6);
    System.out.println("New list after removed element");
    removeElementsList.printListNode(removeElementsList);
  }
}
