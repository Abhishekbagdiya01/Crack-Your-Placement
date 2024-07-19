package Arrays;
//https://leetcode.com/problems/majority-element/
import java.util.HashMap;
public class MajorityElement {
   public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(!hashmap.containsKey(nums[i]))
                hashmap.put(nums[i], 1);
            else 
                hashmap.put(nums[i], hashmap.get(nums[i])+1);
            if(hashmap.get(nums[i]) > nums.length/2)
                n = nums[i];
        }
        return n;
        }
    public static void main(String[] args) {
        int [] nums={2,2,1,1,1,2,2};
     System.out.println(

        majorityElement(nums)
     );

    }
}
