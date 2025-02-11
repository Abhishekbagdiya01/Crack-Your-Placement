public class LongestRepeatingCharacterReplacement {
  public static void main(String[] args) {
    String s = "ABAB";
    int k = 2;
    System.out.println(longestRepeatingCharacterReplacement(s, k));
  }

  private static int longestRepeatingCharacterReplacement(String s, int k) {
    int ans = 0;
    int max = 0;
    int left = 0;
    int[] occurance = new int[26];
    for (int right = 0; right < s.length(); right++) {
      max = Math.max(max, ++occurance[s.charAt(right) - 'A']);
      if (right - left + 1 - max > k) {
        occurance[s.charAt(left) - 1]--;
        left++;
      }
      ans = Math.max(ans, right - left + 1);
    }
    return ans;
  }
}
