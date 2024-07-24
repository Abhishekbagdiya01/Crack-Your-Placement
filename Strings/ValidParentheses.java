package Strings;

import java.util.Stack;
//https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
           char ch = s.charAt(i);
           if ( ch == '(' || ch == '{' || ch == '[' ) {
            stack.add(ch);
           } 
           else {
                if (stack.isEmpty()) {
                return false; 
                }
                int top = stack.pop();
                if (ch ==')' && top != '(') {
                    return false;
                }
                if (ch =='}' && top != '{') {
                        return false;
                }
                if (ch ==']' && top != '[') {
                    return false;
                }
           }
        }
     return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}
