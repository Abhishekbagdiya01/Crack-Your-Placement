public class CheckIfArrayIsSortedandRotated {
  public static boolean checkIf(int[] nums) {
    int rotates = 0;
    int n = nums.length;
    for (int i = 0; i < n; i++) {
      if (nums[i] > nums[(i + 1) % n] && ++rotates > 1) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int[] nums = { 3, 4, 5, 1, 2 };
    System.out.println(checkIf(nums));
  }
}
