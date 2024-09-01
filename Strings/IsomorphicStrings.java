public class IsomorphicStrings {
  public static boolean isIsomorphic(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    int[] sMap = new int[256];
    int[] tMap = new int[256];

    for (int i = 0; i < s.length(); i++) {
      char charS = s.charAt(i);
      char charT = t.charAt(i);

      if (sMap[charS] != tMap[charT]) {
        return false;
      }

      sMap[charS] = i + 1;

      tMap[charT] = i + 1;
    }

    return true;
  }

  public static void main(String[] args) {
    String s = "paper";
    String t = "title";
    boolean ans = isIsomorphic(s, t);
    System.out.println("S : " + s + " T: " + t + ",is isomorphic string : " + ans);
  }
}
