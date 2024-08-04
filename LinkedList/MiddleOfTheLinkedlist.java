// https://leetcode.com/problems/middle-of-the-linked-list/

class ListNode {
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
}

public class MiddleOfTheLinkedlist {
    public static ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }

        int mid = size / 2;
        current = head;
        for (int i = 0; i < mid; i++) {
            current = current.next;
        }
        return current;

    }

    public static void printListNode(ListNode listNode) {
        while (listNode != null) {
           if (listNode.next != null) {
            System.out.print(listNode.val + " -> ");
           }else{
            System.out.print(listNode.val + " ");
           }
            listNode = listNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // [1,2,3,4,5,6]
        ListNode ll = new ListNode(1,
                new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode ll1 = ll;
        // Printing originasl ListNode
        System.out.println("Original ListNode");
        printListNode(ll1);
        System.out.println("New List node");
        ListNode newListNode = middleNode(ll);
        printListNode(newListNode);
    }
}
