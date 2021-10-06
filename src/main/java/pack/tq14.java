package pack;

public class tq14 {
    public static String repeatFirstThreeLetters(String str, int n) {
       String repeat3 = str.substring(0,3);


        return repeat3.repeat(n);
    }

    public static void main(String[] args) {
        System.out.println(repeatFirstThreeLetters("Rafiqi", 1));
    }

}
