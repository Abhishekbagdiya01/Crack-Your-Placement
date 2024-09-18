import java.util.HashSet;

public class LinkedListCycleII {
  public static ListNode detectCycle(ListNode head) {
    HashSet<ListNode> set = new HashSet<>();
    ListNode current = head;
    while (current != null) {
      if (set.contains(current))
        return current;
      set.add(current);
      current = current.next;
    }
    return null;
  }

  public static void main(String[] args) {
    ListNode listNode = new ListNode(1,
        new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));

    ListNode cyclicNode = detectCycle(listNode);
    System.out.println("Cyclic node value : " + cyclicNode.val);
  }
}
