
/**
 * LongestConsecutive
 */
import java.util.Arrays;
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

  public static int longestConsecutive1(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    Arrays.sort(nums);
    int lcs = 1;
    int curr = 1;
    for (int i = 1; i < nums.length; i++) {
      int diff = nums[i] - nums[i - 1];
      if (diff == 1) {
        curr += 1;
      } else {
        curr = 1;
      }
      lcs = Math.max(curr, lcs);
    }
    return lcs;
  }

  public static void main(String[] args) {
    int[] nums = { 100, 4, 200, 1, 3, 2 };
    System.out.println("Method 1 Longest Consecutive is " + longestConsecutive(nums));
    System.out.println("Method 2 Longest Consecutive is " + longestConsecutive1(nums));
  }
}
