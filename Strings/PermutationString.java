
public class PermutationString {
  public static boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length())
      return false;
    int[] s1Map = new int[26];
    int[] s2Map = new int[26];

    for (int i = 0; i < s1.length(); i++) {
      s1Map[s1.charAt(i) - 'a']++;
      s2Map[s2.charAt(i) - 'a']++;
    }

    for (int i = 0; i < s2.length() - s1.length(); i++) {
      if (match(s1Map, s2Map)) {
        return true;
      }

      s2Map[s2.charAt(i + s1.length()) - 'a']++;
      s2Map[s2.charAt(i) - 'a']--;
    }
    return match(s1Map, s2Map);
  }

  private static boolean match(int[] s1Map, int[] s2Map) {
    for (int i = 0; i < 26; i++) {
      if (s1Map[i] != s2Map[i])
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    String s1 = "adc";
    String s2 = "dcda";
    System.out.println(checkInclusion(s1, s2));
  }
}
