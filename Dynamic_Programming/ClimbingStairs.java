//https://leetcode.com/problems/climbing-stairs/description/
public class ClimbingStairs {
   public static int climbStairs(int n) {
    int prev = 1;
    int next = 1;
    int result = 0;

    for (int i = 2; i <= n; i++) {
      result = prev + next;
      prev = next;
      next = result;
    }
    return result;
  }
  public static void main(String[] args) {
    int n = 4;
    System.out.println(climbStairs(n));
  }
}
