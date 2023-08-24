package Activity13;

public class MethodDemo{
    public static void main(String[] args){

        String x = "string1";
        String y = "string2";
        char a = 'b';

        System.out.println("The total size of the Strings are: " + findTotalLength(x, y));
        System.out.println("The unicode value for the character is: " + findUnicodeValue(a));

    }
    private static int findTotalLength(String x, String y) {
        int stringSize = x.length() + y.length();
        return stringSize;
    }
    private static int findUnicodeValue(char a){
        int value = (int) a;
        return value;

    }
}
