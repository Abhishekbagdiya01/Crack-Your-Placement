package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class FindAllDublicate {
    public static ArrayList<Integer> findDuplicates(int[] nums) {
       ArrayList<Integer> list = new ArrayList<>() ;
       Arrays.sort(nums);
       for(int i =0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
                    list.add(nums[i]);
                }       
       }
       return list;
    }
   public static void main(String[] args) {
    int[] nums = {4,3,2,7,8,2,3,1};
    ArrayList<Integer> arrayList = findDuplicates(nums);
    for (Object object : arrayList) {
        System.out.println(object);
    }
   } 
}
