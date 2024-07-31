package Mathematical;

public class AddBinary {
    public static String addBinary(String a, String b) {
int decimal_a=Integer.parseInt(a,2);

    int decimal_b=Integer.parseInt(b,2);

    int add=decimal_a + decimal_b;

    return Integer.toBinaryString(add);
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
      String result =  addBinary(a, b);
      System.out.println(result);
    }
 
}
