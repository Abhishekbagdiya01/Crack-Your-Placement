public class SqrtX {
  public static int mySqrt(int x) {
    long start = 1;
    long end = x;
    long ans = 0;
    while (start <= end) {
      long mid = (start + end) / 2;
      if (mid * mid == x) {
        ans = (int) mid;
        break;
      } else if (mid * mid < x) {
        start = mid + 1;
        ans = mid;
      } else {
        end = mid - 1;
      }
    }
    return (int) ans;
  }

  public static void main(String[] args) {
    int x = 18;
    System.out.println(mySqrt(x));
  }
}
