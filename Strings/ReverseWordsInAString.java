package Strings;

import java.util.Arrays;
//https://leetcode.com/problems/reverse-words-in-a-string/description/
public class ReverseWordsInAString {
   public static String reverseWords(String s){
    String trimmedOgString = s.trim();
        String[] str = trimmedOgString.split("\\s+");
        int n = str.length;
        String[] newStr = new String[n];
        for(int i=0;i<n; i++){
           newStr[i] = str[str.length-i-1];
        }
        return  Arrays.toString(newStr).replace("[", "").replace("]", "").replace(",", "");
   } 
   public static void main(String[] args) {
    String s = "a good   example";
    System.out.println(reverseWords(s));
   }
}
