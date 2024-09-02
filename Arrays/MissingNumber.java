public class MissingNumber {
  public static int missingNumber(int[] nums) {
    int n = nums.length;
    int expectedSum = n * (n + 1) / 2; // Formula for the sum of numbers from 0 to n
    int actualSum = 0;

    for (int num : nums) {
      actualSum += num;
    }

    return expectedSum - actualSum;
  }

  public static void main(String[] args) {
    int[] nums = { 3, 0, 1 };
    System.out.println(missingNumber(nums));
  }
}
