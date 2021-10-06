package pack;

public class tq12 {
    public static void printOddNumbersInRange(int start, int end){
        for (int i=start; i<= end; i++)
        {
        if (i % 2!=0)
            System.out.println(i);
        }


    }

    public static void main(String[] args) {
        printOddNumbersInRange(1,99);


    }

}
