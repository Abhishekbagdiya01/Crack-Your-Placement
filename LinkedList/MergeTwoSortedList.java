import java.util.ArrayList;
import java.util.Collections;

//https://leetcode.com/problems/merge-two-sorted-lists/description/
public class MergeTwoSortedList {
  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode l1 = list1;
    ListNode l2 = list2;
    ListNode temp = new ListNode();
    ListNode dummy = temp;

    while (l1 != null && l2 != null) {
      if (l1.val > l2.val) {
        temp.next = l2;
        temp = l2;
        l2 = l2.next;
      } else {
        temp.next = l1;
        temp = l1;
        l1 = l1.next;
      }
    }
    if (l1 != null) {
      temp.next = l1;
    } else {
      temp.next = l2;
    }
    return dummy.next;
  }

  public static ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
    ListNode l1 = list1;
    ListNode l2 = list2;
    ListNode newNode = new ListNode();
    ListNode dummy = newNode;
    ArrayList<Integer> arr = new ArrayList<>();
    while (l1 != null) {
      arr.add(l1.val);
      l1 = l1.next;
    }
    while (l2 != null) {
      arr.add(l2.val);
      l2 = l2.next;
    }
    Collections.sort(arr);
    for (Integer i : arr) {
      ListNode addList = addLinkedList(i);
      newNode.next = addList;
      newNode = newNode.next;

    }
    return dummy.next;
  }

  public static ListNode addLinkedList(int val) {
    ListNode newNode = new ListNode(val);
    return newNode;
  }

  public static void main(String[] args) {
    ListNode list1 = new ListNode(1,
        new ListNode(2, new ListNode(4)));
    ListNode list2 = new ListNode(1,
        new ListNode(2, new ListNode(3)));
    System.out.println("List 1");
    list1.printListNode(list1);
    System.out.println("List 2");
    list1.printListNode(list2);

    ListNode result = mergeTwoLists(list1, list2);
    System.out.println("Sorted List");
    result.printListNode(result);
    ListNode result1 = mergeTwoLists1(list1, list2);
    System.out.println("Sorted List");
    result1.printListNode(result1);
  }
}
