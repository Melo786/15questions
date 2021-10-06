package pack;

public class tq1 {
    public static int getLastIndex(String[] names){
    int lastIndex = names.length-1;
    return lastIndex;
    }
    public static void main(String[] args) {
    String[] nameList = {"Shafi", "Mikaila", "Boris", "Jordan", "Shannon"};
        System.out.println(getLastIndex(nameList));
    }
}
