package pack;

public class tq5 {
    public static String getSecondToLastElement(String[] names) {
        String Second2Last = names[names.length-2];
        return Second2Last;
    }

    public static void main(String[] args) {
        String[] nameList = {"Shafi", "Mikaila", "Boris", "Jordan", "Shannon","Cece","Daya"};
        System.out.println(getSecondToLastElement(nameList));
    }

}
