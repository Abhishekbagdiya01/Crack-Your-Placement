public class RangeSumQuery {
  public static void main(String[] args) {
    int[] nums = { -2, 0, 3, -5, 2, -1 };
    NumArray numArray = new NumArray(nums);
    System.out.println(
        "" + numArray.sumRange(0, 2) +
            ", " + numArray.sumRange(2, 5) +
            ", " + numArray.sumRange(0, 5));
  }
}

class NumArray {
  int[] prefixSum;

  public NumArray(int[] arr) {
    prefixSum = new int[arr.length];
    if (arr.length == 0) {
      return;
    }
    prefixSum[0] = arr[0];
    for (int i = 1; i < arr.length; i++) {
      prefixSum[i] = prefixSum[i - 1] + arr[i];
    }
  }

  public int sumRange(int left, int right) {
    if (left == 0)
      return prefixSum[right];
    return prefixSum[right] - prefixSum[left - 1];
  }
}
