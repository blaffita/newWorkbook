package Activity12;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FileProcessing {
    public static void main(String[] args)throws IOException{
        try{
            Scanner input = new Scanner(new File("numbers.txt"));
            double sum = 0;
            double count = 0;
            double num = 0;
            while(input.hasNextDouble()){
                num = input.nextDouble();
                sum += num;
                count++;
                
            }
            if(count > 0){
                double mean = sum/count;
                System.out.println("Mean: " + mean);
        
                if(count > 0 && count <= 5){
                    double sub = (num - mean);
                    double pow = Math.pow(sub, 2);
                    double sigma = count+(pow);
                    double frac = sigma/(count - 1);
                    double stdev = Math.sqrt(frac);
                    System.out.println("Standard Deviation: " + stdev);
                }
                }
            }
        
            catch(Exception e){
                System.out.println(e.getMessage());
        }
    }
}

