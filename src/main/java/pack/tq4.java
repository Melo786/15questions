package pack;

public class tq4 {
    public static String getLastElement(String[] names) {
        String lastElement = names[names.length-1];
        return lastElement;
    }
    public static void main(String[] args) {
        String[] nameList = {"Shafi", "Mikaila", "Boris", "Jordan", "Shannon","Cece"};
        System.out.println(getLastElement(nameList));
    }

}
