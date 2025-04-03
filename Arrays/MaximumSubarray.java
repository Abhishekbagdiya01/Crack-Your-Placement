public class MaximumSubarray {
  public static void main(String[] args) {
    int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    System.out.println(maxSubArray(nums));

  }

  public static int maxSubArray(int[] nums) {
    int currMax = nums[0];
    int total = currMax;

    for (int i = 0; i < nums.length; i++) {
      currMax = Math.max(currMax + nums[i], nums[i]);
      total = Math.max(currMax, total);
    }
    return total;
  }
}
