package Arrays;

// Sort Colors 
//https://leetcode.com/problems/sort-colors/description/
public class SortColors {

  public static void sortColors(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] > nums[j]) {
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
        }
      }
    }
    for (int i : nums) {
      System.out.println(i);
    }
  }

  // Using DNF DUTCH NATION FLAG ALGORITHM
  public void sortColors1(int[] nums) {
    int l = 0, mid = 0, h = nums.length - 1;
    while (mid <= h) {
      switch (nums[mid]) {
        case 0:
          swap(nums, l, mid);
          mid++;
          l++;
          break;
        case 1:
          mid++;
          break;
        case 2:
          swap(nums, mid, h);
          h--;
          break;
      }
    }
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 0, 2, 1, 1, 0 };
    sortColors(nums);
    sortColors1(nums);
  }
}
