public class PowerofTwo {
  public static boolean isPowerOfTwo(int n) {
    if (n == 1) {
      return true;
    } else if (n % 2 != 0 || n == 0) {
      return false;
    } else {
      return isPowerOfTwo(n / 2);
    }
  }

  public static void main(String[] args) {
    int n = 16;
    System.out.println(isPowerOfTwo(n));
  }
}
