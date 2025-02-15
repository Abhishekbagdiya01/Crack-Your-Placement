import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
  public static int[] dailyTempreatures(int[] temps) {
    int[] ans = new int[temps.length];
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < temps.length; i++) {
      while (!stack.isEmpty() && temps[i] > temps[stack.peek()]) {
        int index = stack.pop();
        ans[index] = i - index;
      }
      stack.push(i);
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] temps = { 73, 74, 75, 71, 69, 72, 76, 73 };
    System.out.println(Arrays.toString(dailyTempreatures(temps)));
  }
}
