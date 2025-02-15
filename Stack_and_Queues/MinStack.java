public class MinStack {
  Node head;

  MinStack() {
  }

  public void push(int val) {
    if (head == null) {
      head = new Node(val, val, null);
    } else {
      head = new Node(val, Math.min(val, head.min), head);
    }
  }

  public void pop() {
    head = head.next;
  }

  public int top() {
    return head.val;
  }

  public int getMin() {
    return head.min;
  }

  public static void main(String[] args) {
    MinStack obj = new MinStack();
    obj.push(1);
    obj.push(2);
    obj.push(3);
    System.out.println(obj.getMin());
    obj.pop();
    System.out.println(obj.top());
    System.out.println(obj.getMin());
  }
}

class Node {
  int val;
  int min;
  Node next;

  Node(int val, int min, Node next) {
    this.val = val;
    this.min = min;
    this.next = next;
  }
}
