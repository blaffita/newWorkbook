package Activity14;
import java.util.Scanner;
public class LeibnizPiCalculation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        getNumerator(0);

        System.out.println("Enter a number: ");
        int k = input.nextInt();

    }
    public static int getNumerator(int k){
        double pow = Math.pow(k+1, 2);
        int sum = (int) ((-1)*pow);

        return sum;

    }
    public static int getDenominator(int k){
        return k;

    }
}
