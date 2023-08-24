package Activity8;
import java.util.Scanner;
public class StringComparision {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please provide an integer: ");
        int num1 = input.nextInt();

        System.out.println("Please provide a second integer");
        int num2 = input.nextInt();

        if(num1 > num2){
            System.out.println("In increasing order " + num2 + " comes before integer " + num1);
        }
        else{
            System.out.println("In increasing order " + num1 + " comes before integer " + num2);
        }



    }
}
