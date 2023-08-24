package Activity15;

public class ArrayOperations{
    public static void main(String[] args){
        double[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(array[0] + ", " + array[2] + ", " + array[9]);

        System.out.println(add(array));
        System.out.println(mean(array));
        System.out.println(size(array));
        printReverse(array);
    }
    public static double add(double[] array){
        int sum = 0;
        for (int i = 0; i < array.length + 1; i++) {
            sum += i;
        }
        return sum;
    }
    public static double mean(double[] array){
        int sum = 0;
        int mean = 0;
        for (int i = 0; i < array.length + 1; i++) {
            sum += i;
            mean = sum/array.length;
        }
        return mean;
    }
    public static double size(double[] array){
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            size = array.length;
        }
        return size;
    }
    public static void printReverse(double[] array){
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}