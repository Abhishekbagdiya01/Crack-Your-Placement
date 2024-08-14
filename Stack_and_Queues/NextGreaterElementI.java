//https://leetcode.com/problems/next-greater-element-i/description/
public class NextGreaterElementI {
  public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int[] array = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
      int j = 0;
      while (j < nums2.length && nums2[j] != nums1[i]) {
        j++;
      }
      int nextGreater = -1;
      while (j < nums2.length) {
        if (nums2[j] > nums1[i]) {
          nextGreater = nums2[j];
          break;
        }
        j++;
      }
      array[i] = nextGreater;
    }
    return array;
  }

  public static void printArray(int[] nums) {
    System.out.print("\t [");
    for (int i = 0; i < nums.length; i++) {
      String output = (i != nums.length - 1) ? (nums[i] + ",") : (nums[i] + "]");
      System.out.print(output);
    }

    System.out.println();
  }

  public static void main(String[] args) {
    int nums1[] = { 4, 1, 2 }, nums2[] = { 1, 3, 4, 2 };
    System.out.println("Nums1 - ");
    printArray(nums1);
    System.out.println("Nums2 - ");
    printArray(nums1);
    int result[] = nextGreaterElement(nums1, nums2);
    System.out.println("Result - ");
    printArray(result);
  }
}
