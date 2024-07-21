package Strings;
import java.util.HashMap;
import java.util.Map;

public class PrintDublicatesInString {
    public static void printDubs(String str){
        Map<Character,Integer> count = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
           if (count.containsKey(ch)) {
               int countNo =  count.get(ch); 
               count.put(ch,countNo+1 );
           } else{
            count.put(ch,1);
           }
        }
        for (Map.Entry<Character,Integer> map : count.entrySet()) {
            if (map.getValue() > 1) {
               System.out.println(map.getKey() + " ," + map.getValue()); 
            } 
        }
    }
    
    public static void main(String[] args) {
    String str = "Abhishek bagdiya";
        printDubs(str);
    }
}
