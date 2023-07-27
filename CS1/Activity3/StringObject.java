public class StringObject {
    public static void main(String[] args){
        String word = "pRoGrAmMiNg iS, FuN";
        System.out.println(word);

        System.out.println(word.length());
        
        System.out.println(word.toLowerCase());

        System.out.println(word.charAt(0));

        System.out.println(word.charAt(1));

        System.out.println(word.charAt(word.length()-1));

        System.out.println(word.substring(16, 19).toUpperCase());

        System.out.println(word.substring(0, 11).toLowerCase());
    }
}
