
/**
 * AddTwoNumbers
 * https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {
  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummyHead = new ListNode(0);
    ListNode tail = dummyHead;
    int carry = 0;
    while (l1 != null || l2 != null || carry != 0) {
      int digit1 = (l1 != null) ? l1.val : 0;
      int digit2 = (l2 != null) ? l2.val : 0;

      int sum = digit1 + digit2 + carry;
      int digit = sum % 10;
      carry = sum / 10;
      ListNode node = new ListNode(digit);
      tail.next = node;
      tail = tail.next;
      l1 = (l1 != null) ? l1.next : null;
      l2 = (l2 != null) ? l2.next : null;
    }
    ListNode result = dummyHead.next;
    dummyHead.next = null;
    return result;
  }

  public static void main(String[] args) {
    ListNode list1 = new ListNode(2,
        new ListNode(4, new ListNode(3)));
    ListNode list2 = new ListNode(5,
        new ListNode(6, new ListNode(4)));
    list1.printListNode(list1);
    list2.printListNode(list2);

    ListNode result = addTwoNumbers(list1, list2);
    System.out.print("Result : ");
    result.printListNode(result);
  }
}
