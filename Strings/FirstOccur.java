package Strings;
//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
public class FirstOccur {
   public static int strStr(String haystack, String needle) {
       int index = haystack.indexOf(needle);
       return index;
    } 
    public static void main(String[] args) {
       String haystack = "sadbutsad", needle = "sad";
      int index = strStr(haystack, needle);
      System.out.println(index);
    }
}
