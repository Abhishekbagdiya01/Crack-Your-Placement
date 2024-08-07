//https://leetcode.com/problems/palindrome-linked-list/

import java.util.Stack;

public class PalindromeLinkedList {
  public static boolean isPalindrome(ListNode head) {
    Stack<Integer> stack = new Stack<>();
    ListNode current = head;
    while (current != null) {
      stack.push(current.val);
      current = current.next;
    }
    current = head;
    while (current != null) {
      if (stack.pop() != current.val) {
        return false;
      }
      current = current.next;

    }
    return true;
  }

  public static void main(String[] args) {
    ListNode listNode = new ListNode(1,
        new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(2, new ListNode(1))))));
    listNode.printListNode(listNode);
    System.out.println(isPalindrome(listNode));
  }
}
