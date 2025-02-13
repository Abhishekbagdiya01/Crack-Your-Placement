import java.util.HashMap;

public class MinimumWindowSubstring {
  public static void main(String[] args) {
    String s = "ABACDABCD";
    String t = "ABC";
    System.out.println(minWindow(s, t));
    System.out.println(minWindow("a", "aa"));
  }

  private static String minWindow(String s, String t) {
    int left = 0;
    int match = 0;
    int minLength = Integer.MAX_VALUE;
    int start = 0;
    HashMap<Character, Integer> tMap = new HashMap<>();
    for (int i = 0; i < t.length(); i++) {
      char ch = t.charAt(i);
      tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
    }

    for (int right = 0; right < s.length(); right++) {
      char ch = s.charAt(right);
      if (tMap.containsKey(ch)) {
        tMap.put(ch, tMap.get(ch) - 1);
        if (tMap.get(ch) >= 0) {
          match++;
        }
      }

      while (match == t.length()) {
        if (minLength > right - left + 1) {
          minLength = right - left + 1;
          start = left;
        }

        char leftChar = s.charAt(left);
        left++;

        if (tMap.containsKey(leftChar)) {
          if (tMap.get(leftChar) == 0) {
            match--;
          }
          tMap.put(leftChar, tMap.get(leftChar) + 1);
        }
      }
    }
    if (minLength > s.length()) {
      return "";
    }
    return s.substring(start, start + minLength);
  }
}
