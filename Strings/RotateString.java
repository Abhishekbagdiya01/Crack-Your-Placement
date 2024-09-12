public class RotateString {
  public static boolean rotateString(String s, String goal) {
    return s.length() == goal.length() && (s + s).contains(goal) ? true : false;
  }

  public static boolean rotateString1(String s, String goal) {
    String result = "";
    for (int i = 0; i < s.length(); i++) {
      result = s.substring(1, s.length()) + s.charAt(0);
      s = result;
      if (s.equals(goal)) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    String s = "abcde";
    String goal = "cdeab";
    System.out.println(rotateString(s, goal));
    System.out.println(rotateString1(s, goal));
  }
}
