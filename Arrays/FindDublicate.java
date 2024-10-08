package Arrays;
import java.util.HashSet;
/**
 * Find Dublicate
 * https://leetcode.com/problems/find-the-duplicate-number/
 */
public class FindDublicate {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
       System.out.println(findDuplicate(arr));
    }
     public static int findDuplicate(int[] nums) {
     HashSet<Integer> set = new HashSet<>();
     for (int i = 0; i < nums.length; i++) {
      if (set.contains(nums[i])) {
        return nums[i];
      }
      set.add(nums[i]);
     }
      return 0;
    }
}