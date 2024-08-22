
//https://leetcode.com/problems/range-sum-query-immutable/description/
import java.util.ArrayList;

public class RangeSumQuery {
  int[] nums;

  public RangeSumQuery(int[] nums) {
    this.nums = nums;
  }

  public int sumRange(int left, int right) {
    int sum = 0;
    for (int i = left; i <= right; i++) {
      sum += nums[i];
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] num = { -2, 0, 3, -5, 2, -1 };
    ArrayList<Integer> list = new ArrayList<>();
    RangeSumQuery sRangeSumQuery = new RangeSumQuery(num);
    list.add(sRangeSumQuery.sumRange(0, 2));
    list.add(sRangeSumQuery.sumRange(2, 5));
    list.add(sRangeSumQuery.sumRange(0, 5));
    System.out.println(list);
  }
}
