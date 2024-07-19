package Arrays;
// Sort Colors 
//https://leetcode.com/problems/sort-colors/description/
public class SortColors {

    public static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
           for (int j = i+1; j < nums.length; j++) {
               if (nums[i]>nums[j]) {
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
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }
}