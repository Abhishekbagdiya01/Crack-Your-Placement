
/**
 * LongestConsecutive
 */
import java.util.HashSet;

public class LongestConsecutive {

  public static int longestConsecutive(int[] nums) {
    HashSet<Integer> numSet = new HashSet<>();
    for (int num : nums) {
      numSet.add(num);
    }

    int longest = 0;

    for (int num : nums) {
      if (!numSet.contains(num - 1)) {
        int length = 1;

        while (numSet.contains(num + length)) {
          length++;
        }

        longest = Math.max(longest, length);
      }
    }

    return longest;
  }

  public static void main(String[] args) {
    int[] nums = { 100, 4, 200, 1, 3, 2 };
    System.out.println("Longest Consecutive is " + longestConsecutive(nums));
  }
}
