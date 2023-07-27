package Activity5;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class UserInteractionsWithScanner {
    public static void main(String[] args){
        // Scanner input = new Scanner(System.in);
        
        // System.out.println("What is your name?");
        // String name = input.nextLine();

        // System.out.println("What is your favorite food?");
        // String food = input.nextLine();

        // System.out.println("What is your age?");
        // int age = input.nextInt();

        // int born = 2023 - age;
        // System.out.println("Pleased to meet you " + name + ". I also like " + food + "!!. I bet you were born in " + born + ", eh?");

        String name = JOptionPane.showInputDialog(null, "What is your name?");
        String food = JOptionPane.showInputDialog(null, "What is your favorite food?");
        String age = JOptionPane.showInputDialog(null, "What is your age");

        int ageInt = Integer.parseInt(age);
        int born = 2023 - ageInt;

        JOptionPane.showMessageDialog(null, "Pleased to meet you " + name + ". I also like " + food + "!! I bet you were born in " + born + " eh?");

        
    }
}
