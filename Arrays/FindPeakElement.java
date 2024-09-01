public class FindPeakElement {
  public static int findPeakElement(int[] nums) {
    int max = nums[0];
    int maxIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
        maxIndex = i;
      }
    }
    return maxIndex;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1 };
    int ans = findPeakElement(arr);
    System.err.println(ans);
  }
}
