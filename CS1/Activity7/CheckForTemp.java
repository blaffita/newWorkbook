package Activity7;
import java.util.Scanner;
public class CheckForTemp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the current temprature: ");
        int currentTemp = input.nextInt();

        if(currentTemp <= 80 && currentTemp >= 30){
            System.out.println("Wear shorts and a t-shirt");
        }
        else if(currentTemp >= 110 || currentTemp <= 30){
            System.out.println("Do not go outside");
        }
        else if(currentTemp <= 30){
            System.out.println("Wear jeans and jacket");
        }
    }
}
