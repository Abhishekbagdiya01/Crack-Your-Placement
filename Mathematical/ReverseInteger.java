/**
 * ReverseInteger
 */
public class ReverseInteger {

  public static int reverseInteger(int num) {
    int reverseNum = 0;
    while (num != 0) {
      if (reverseNum > Integer.MAX_VALUE / 10 || reverseNum < Integer.MIN_VALUE) {
        return 0;
      }
      int digit = num % 10;
      reverseNum = (reverseNum * 10) + digit;
      num = num / 10;
    }

    return reverseNum;
  }

  public static void main(String[] args) {
    int num = 123;
    System.out.println("Original number : " + num);
    System.out.println("Reversed number : " + reverseInteger(num));
  }
}
