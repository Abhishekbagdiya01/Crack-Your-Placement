import java.util.Stack;

public class EvaluateReversePolishNotation {
  public static int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();

    for (String token : tokens) { // Enhanced for loop for cleaner iteration
      switch (token) { // Use a switch statement for more concise code
        case "+":
          stack.push(stack.pop() + stack.pop());
          break;
        case "-":
          int operand2 = stack.pop(); // Correct order: operand2 - operand1
          int operand1 = stack.pop();
          stack.push(operand1 - operand2);
          break;
        case "*":
          stack.push(stack.pop() * stack.pop());
          break;
        case "/":
          operand2 = stack.pop(); // Correct order: operand2 / operand1
          operand1 = stack.pop();
          stack.push(operand1 / operand2);
          break;
        default: // For numbers
          stack.push(Integer.parseInt(token));
      }
    }

    return stack.pop(); // The final result is left on the stack
  }

  public static void main(String[] args) {
    String[] tokens = { "2", "1", "+", "3", "*" };
    System.out.println(evalRPN(tokens));
  }
}
