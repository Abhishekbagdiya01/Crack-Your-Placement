public class SingleNumber {
  public static int singleNumber(int[] nums) {
    int ans = 0;
    for (int num : nums) {
      ans ^= num;
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 1, 2, 2, 3, 4, 4, 5, 5 };
    System.out.println("Single number in array is " + singleNumber(nums));
  }
}
