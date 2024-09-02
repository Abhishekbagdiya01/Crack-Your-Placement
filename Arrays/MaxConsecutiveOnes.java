import java.util.ArrayList;

public class MaxConsecutiveOnes {
  // https://leetcode.com/problems/max-consecutive-ones/
  public static int findMaxConsecutiveOnes(int[] nums) {
    int cnt = 0, max = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        cnt++;
        if (max < cnt) {
          max = cnt;
        }
      } else {
        cnt = 0;
      }
    }
    return max;
  }

  public static int findMaxConsecutiveOnesUsingArrayList(int[] nums) {
    ArrayList<Integer> list = new ArrayList<>();
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        count++;
      } else {
        list.add(count);
        count = 0;
      }
      list.add(count);
    }

    int max = list.get(0);
    for (int i = 1; i < list.size(); i++) {
      if (list.get(i) > max) {
        max = list.get(i);
      }
    }

    return max;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 1, 0, 1, 1, 1 };
    System.out.println(findMaxConsecutiveOnes(arr));
    System.out.println(findMaxConsecutiveOnesUsingArrayList(arr));
  }
}
