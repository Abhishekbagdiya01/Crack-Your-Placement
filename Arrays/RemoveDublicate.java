package Arrays;
import java.util.Arrays;
import java.util.HashSet;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
class RemoveDublicate{
     public static int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            }else{
                nums[i]=100;
            }
        }    
        Arrays.sort(nums);
        for (Integer integer : nums) {
            System.out.println(integer);
        }
    return  set.size();
    }
    public static void main(String[] args) {
       int[] nums = {0,0,1,1,1,2,2,3,3,4};
       System.out.println(removeDuplicates(nums)); 
    }
}
