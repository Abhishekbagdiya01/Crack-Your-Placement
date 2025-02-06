import java.util.Arrays;

public class TwoSumV2 {
  public static int[] twoSum(int[] nums, int target) {
    int l = 0;
    int r = nums.length - 1;
    while (l < r) {
      if (nums[l] + nums[r] == target) {
        return new int[] { l + 1, r + 1 };
      } else if (nums[l] + nums[r] > target) {
        r--;
      } else {
        l++;
      }
    }
    return new int[] {};
  }

  public static void main(String[] args) {
    int[] exp = { 2, 7, 11, 15 };
    System.out.println(Arrays.toString(twoSum(exp, 9)));

    System.out.println(Arrays.toString(twoSum(exp, 18)));
  }
}
