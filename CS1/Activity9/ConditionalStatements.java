import java.util.Scanner;
public class ConditionalStatements{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please give me a word: ");
        String word = input.nextLine();

        System.out.println("Please give me another word: ");
        String word1 = input.nextLine();

        if(word.equals(word1)){
            System.out.println("In alphabetical order " + word + " comes before " + word1);
        }
        else{
            System.out.println("In alphabetical order " + word1 + " comes before " + word);
        }
    }
}