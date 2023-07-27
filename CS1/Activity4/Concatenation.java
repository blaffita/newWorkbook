package Activity4;

public class Concatenation {
    public static void main(String[] args){
        String month = "July";
        String day = "Monday";
        String major = "Computer Science";

        System.out.println("Today is " + month + ", 2022. The day is " + day + ". Our major is " + major + ".");

        String characters = month + day + major;
        System.out.println("The total number of characters are: " + characters.length());
        
        String FirstName = "Benjamin";
        String LastName = "Laffita";
        System.out.println(FirstName.toUpperCase().charAt(0) + "." + LastName.toUpperCase().charAt(0) + ".");
    }
    
}
