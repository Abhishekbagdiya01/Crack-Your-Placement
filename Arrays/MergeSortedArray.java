package Arrays;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m;i<nums1.length;i++){
           nums1[i]= nums2[i-n];
        }
        Arrays.sort(nums1);

        for (int i : nums1) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
}
}
