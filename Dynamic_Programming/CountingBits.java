/**
 * CountingBits
 * https://leetcode.com/problems/climbing-stairs/description/
 */
public class CountingBits {

  public static int[] countBits(int n) {
    int[] arr = new int[n + 1];
    for (int i = 0; i <= n; i++) {
      String binary = Integer.toBinaryString(i);
      int sum = 0;
      for (int j = 0; j < binary.length(); j++) {
        sum += binary.charAt(j) - '0';
        arr[i] = sum;

      }
    }
    int[] newArr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      newArr[i] = arr[i];
    }
    return newArr;
  }

  public static void main(String[] args) {
    int n = 5;
    int[] result = countBits(n);
    for (int i : result) {
      System.out.print(i + " " );
    }
  }
}
