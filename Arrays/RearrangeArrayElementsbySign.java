import java.util.Arrays;

public class RearrangeArrayElementsbySign {
  public static int[] rearrangeArrays(int[] nums) {
    int p = 0, n = 1;
    int[] ans = new int[nums.length];
    for (int num : nums) {
      if (num >= 0) {
        ans[p] = num;
        p += 2;
      } else {
        ans[n] = num;
        n += 2;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] nums = { 3, 1, -2, -5, 2, -4 };
    System.out.println(Arrays.toString(rearrangeArrays(nums)));
  }
}
