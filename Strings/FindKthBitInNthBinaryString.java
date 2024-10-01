//https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/submissions/?envType=problem-list-v2&envId=recursion
public class FindKthBitInNthBinaryString {
  public static char findKthBit(int n, int k) {
    String s = "0";

    while (n != 0) {
      StringBuilder temp = new StringBuilder();
      for (char c : s.toCharArray()) {
        if (c == '0') {
          temp.append('1');
        } else {
          temp.append('0');
        }
      }
      s += '1' + temp.reverse().toString();
      n--;
    }

    return s.charAt(k - 1);
  }

  public static void main(String[] args) {
    char ans = findKthBit(3, 1);
    System.out.println(ans);
  }
}
