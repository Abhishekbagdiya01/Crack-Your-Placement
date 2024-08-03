import java.util.ArrayList;
import java.util.List;
public class GenerateParentheses {
  public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        recursionFunc("", 0, 0, n,result);
        return result;
    }

    public static void recursionFunc(String currentStr,int open, int close, int n,List<String> res ) {
        if (n == open && n == close) {
            res.add(currentStr);
            return;
         }

        if (n > open) {
            recursionFunc(currentStr + "(", open + 1, close, n,res);
        }

        if (open > close) {
            recursionFunc(currentStr + ")", open, close + 1, n,res);
        }
    }

  public static void main(String[] args) {
    int n = 3;
    List<String> res = generateParenthesis(n);
    for (String string : res) {
      System.out.print(string + ",");
    }
  }
}
