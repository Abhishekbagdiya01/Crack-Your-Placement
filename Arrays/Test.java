package Arrays;

public class Test {
      public  static int removeDuplicates(int[] nums) {
        int n=0;
        int i=1;
        while(n<nums.length && i<nums.length){
            if(nums[n]==nums[i]){
                i++;
            }
            else{
                nums[++n]=nums[i++];
            }
        }
        return n+1;
     }   
  public static void main(String[] args) {
    int[] nums={1,1,2};
   int a  = removeDuplicates(nums);
   System.out.println(a);
  }
}
