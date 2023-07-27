package Activity10;
import java.util.Scanner;
public class LoopInteraction {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number n: ");
        int n = input.nextInt();

        System.out.print("Enter your name: ");
        String s = input.next();

        System.out.print("For loop: ");

        for (int i = 0; i < n; i++) {
            System.out.print(s + ", ");   
        }
        System.out.println();
        System.out.print("Do While loop: ");

        int i = 0;
        do{
            i++;
            System.out.print(s + ", ");
        }while(i < n);
        System.out.println();
        System.out.print("While loop: ");
        
        i = 0;
        while(i < n){
            System.out.print(s + ", ");
            i++;
        }
    }
}
