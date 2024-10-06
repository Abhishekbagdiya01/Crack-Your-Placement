//https://leetcode.com/problems/reverse-linked-list/description/
public class ReverseLinkedList {
// Iterative 
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
// Recursive
  public static ListNode reverseListRecursion(ListNode head) {
    if (head == null || head.next == null)
      return head;

    ListNode newhead = reverseListRecursion(head.next);
    ListNode front = head.next;
    front.next = head;
    head.next = null;
    return newhead;

  }
  public static void main(String[] args) {
    ListNode listNode = new ListNode(1,
        new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
    ListNode listNode1 = new ListNode(1,
        new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
    System.out.println("Original LinkedList");
    listNode.printListNode(listNode);
    System.out.println("Reversed LinkedList");
    System.out.println("Iterative approach");
     ListNode newListNode = reverseList(listNode);
     newListNode.printListNode(newListNode);

    System.out.println("Recursive approach");
    ListNode newListNodeRecursive = reverseListRecursion(listNode1);
    newListNodeRecursive.printListNode(newListNodeRecursive);

  }
}
