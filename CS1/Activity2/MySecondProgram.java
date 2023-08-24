package Activity2;

public class MySecondProgram {
    public static void main(String[] args){

        String var1 = "Ben";
        String var2 = "Laffita";

        int num = 12;
        double num1 = 5.6;

        char third = var1.charAt(2);
        System.out.println(third);

        double integer = num + num1;
        System.out.println(integer);

        char second = var2.toUpperCase().charAt(2);
        System.out.println(second);

        String password = "" + var2.charAt(0) + var2.charAt(1) + num + var1.charAt(2) + num1 + "$";
        System.out.print(password); 
    }
}
