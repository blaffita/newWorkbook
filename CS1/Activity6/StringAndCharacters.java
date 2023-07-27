package Activity6;

public class StringAndCharacters {
    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = "Good bye";
        String str3 = "World";

        System.out.println(str1.toUpperCase().charAt(0) + "." + str2.toUpperCase().charAt(0) + "." + str3.toUpperCase().charAt(0) + ".");

        char character = (char) (str1.charAt(0) + str1.charAt(1) + str1.charAt(2) + str1.charAt(3) + str1.charAt(4));
        int ascii = (int) character;
        System.out.println(ascii);

        char character1 = (char) (str2.charAt(0) + str2.charAt(1) + str2.charAt(2) + str2.charAt(3) + str2.charAt(4) + str2.charAt(5) + str2.charAt(6) + str2.charAt(7));
        int ascii1 = (int) character1;
        System.out.println(ascii1);

        char character2 = (char) (str3.charAt(0) + str3.charAt(1) + str3.charAt(2) + str3.charAt(3) + str3.charAt(4));
        int ascii2 = (int) character2;
        System.out.println(ascii2);
    }
}
