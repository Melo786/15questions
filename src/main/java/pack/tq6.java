package pack;

import java.util.Arrays;

public class tq6 {
    public static int getSum(int[] ints) {
        int sum = Arrays.stream(ints).sum();
        return sum;
    }

    public static void main(String[] args) {
        int[] sumof = {10,43,71,83,11,};
        System.out.println(getSum(sumof));

    }
}
