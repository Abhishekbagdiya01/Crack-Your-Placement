import java.util.Stack;
import java.lang.StringBuilder;

//https://leetcode.com/problems/remove-outermost-parentheses/description/
public class RemoveOutermostParentheses {
  public static String removeOutermostParentheses(String string) {
    StringBuilder sBuilder = new StringBuilder();
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < string.length(); i++) {
      char ch = string.charAt(i);
      if (ch == '(') {
        if (!stack.isEmpty()) {
          sBuilder.append(ch);
        }
        stack.push(ch);
      } else {
        if (stack.size() > 1) {
          sBuilder.append(ch);
        }
        stack.pop();
      }
    }
    return sBuilder.toString();
  }

  public static void main(String[] args) {
    String str = "(()())(())";
    System.out.println("Original String : " + str);
    String newStr = removeOutermostParentheses(str);
    System.out.println("New String : " + newStr);
  }
}
