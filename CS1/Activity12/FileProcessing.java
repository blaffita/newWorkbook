package Activity12;
import java.io.IOException;
import java.util.Scanner;
public class FileProcessing {
    public static void main(String[] args)throws IOException{
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int line = input.nextInt();
            System.out.println(line);
        }
    }
}
