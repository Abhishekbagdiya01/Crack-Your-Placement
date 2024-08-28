public class FindFirstAndLastPositionOfElementInSortedArray {
  public static int[] searchRange(int[] nums, int target) {
    int l = binarySearch(nums, target);
    if (l == nums.length && nums[l] != target) {
      return new int[] { -1, -1 };
    }
    int r = binarySearch(nums, target + 1) - 1;
    int[] arr = new int[2];
    arr[0] = l;
    arr[1] = r;

    return arr;
  }

  private static int binarySearch(int[] nums, int target) {
    int l = 0;
    int r = nums.length;
    while (l < r) {
      int mid = (l + r) / 2;

      if (nums[mid] >= target) {
        r = mid;
      } else {
        l = mid + 1;
      }

    }
    return l;
  }

  public static void printArray(int[] nums) {
    for (int i : nums) {
      System.out.print(i + " ");
    }
  }

  public static void main(String[] args) {
    int[] nums = { 5, 7, 7, 8, 8, 10 };
    int target = 8;
    int[] result = searchRange(nums, target);
    printArray(nums);
    System.out.println("Target : " + target);
    printArray(result);
  }
}
