// https://leetcode.com/problems/powx-n/?envType=problem-list-v2&envId=recursion
public class Pow {
  public static double myPow(double x, long n) {
    if (n == 0) {
      return 1;
    }
    if (n < 0) {
      double ans = 1 / myPow(x, -n);
      return ans;
    }
    if (n % 2 == 0) {
      return myPow(x * x, n / 2);

    }
    return x * myPow(x, n - 1);

  }

  public static void main(String[] args) {
    double x = 2.0000;
    long n = 10;
    System.out.println(myPow(x, n));
  }
}
