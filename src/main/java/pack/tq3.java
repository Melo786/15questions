package pack;

public class tq3 {
    public static String getFirstElement(String[] names) {
        String firstElement = names[0];
        return firstElement;
    }

    public static void main(String[] args) {
        String[] nameList = {"Shafi", "Mikaila", "Boris", "Jordan", "Shannon"};
        System.out.println(getFirstElement(nameList));
    }
}
