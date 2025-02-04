import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/description/
public class ProductOfArrayExceptSelf {
  public static int[] solution(int[] nums) {
    int[] ans = new int[nums.length];
    int pre = 1;
    int post = 1;
    Arrays.fill(ans, 1);

    for (int i = 0; i < nums.length; i++) {
      ans[i] = pre;
      pre = pre * nums[i];
    }

    for (int i = nums.length - 1; i >= 0; i--) {
      ans[i] = ans[i] * post;
      post = post * nums[i];
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4 };
    System.out.println(Arrays.toString(solution(nums)));
  }
}
