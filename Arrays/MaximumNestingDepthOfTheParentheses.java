public class MaximumNestingDepthOfTheParentheses {
  public static int maxDepth(String s) {
    int max = 0;
    int cnt = 0;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(') {
        cnt++;
        max = Math.max(max, cnt);
      } else if (c == ')') {
        cnt--;
      }
    }

    return max;
  }

  public static void main(String[] args) {
    String s = "(1+(2*3)+((8)/4))+1";
    System.out.println(s + "\n depth : " + maxDepth(s));
  }
}
