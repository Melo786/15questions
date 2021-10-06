package pack;

public class tq10 {
    public static boolean contains(String[] names, String element) {
        for (String wwe:names) {
            if(wwe.equals(element)){
                return true;
            }


        }

        return false;
    }

    public static void main(String[] args) {
        String[] Wrestlers = {"Rey Mysterio","Kane","Randy Orton"};
        System.out.println(contains(Wrestlers,"Randy Orton"));


    }
}
