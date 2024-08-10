/**
 * IntersectionOfTwoLinkedLists
 */
public class IntersectionOfTwoLinkedLists {

  public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode a = headA;
    ListNode b = headB;
    while (a != b) {
      a = a == null ? headB : a.next;
      b = b == null ? headA : b.next;
    }
    return a;
  }

  public static void main(String[] args) {
    ListNode listNode1 = new ListNode(4,
        new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5, new ListNode(6))))));
    ListNode listNode2 = new ListNode(5,
        new ListNode(6, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5))))));

    ListNode res = getIntersectionNode(listNode1, listNode2);
    System.out.println(res);

  }
}
