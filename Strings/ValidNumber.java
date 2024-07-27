package Strings;
//https://leetcode.com/problems/valid-number/
public class ValidNumber {
    public static boolean validNumber(String s){
        String regex =  "^[+-]?(\\d+(\\.\\d*)?|\\.\\d+)([eE][+-]?\\d+)?$";
        return s.matches(regex);
    }
   public static void main(String[] args) {
   String s =  "-123.456e789";
   System.out.println(validNumber(s)); 
   } 
}
