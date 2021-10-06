package pack;



public class tq11 {


    public static int getIndexByElement(String[] names, String element) {
        //loop through names
        //check for name
        //return index for element

        int index = 0;


        for (String str : names) {
            if (str.equals(element)) {
                return index;
            }
            index++;
        }
        return -1;

    }

    public static void main(String[] args) {
        String[] samuelJackson = {"Django", "Pulp Fiction", "Hateful Eight"};
        System.out.println(getIndexByElement(samuelJackson,"Django"));
    }}

