package Strings;

public class ValidPalindrome2 {
    public static boolean validPalindrome(String str){
        for(int left = 0 , right=str.length()-1; left<right; left++,right--){
            if(str.charAt(left)!=str.charAt(right)){
                return isPalindrome(str,left+1,right) || isPalindrome(str,left,right-1);
            }
        }
        return true;
    }

    private static boolean isPalindrome(String str,int left,int right){
        for (; left < right; left++ , right--) {
           if (str.charAt(left) != str.charAt(right)) {
                    return false; 
           } 
        }
        return true;
    }
   public static void main(String[] args) {
   String str = "abca";
   System.out.println(validPalindrome(str));
   } 
}
