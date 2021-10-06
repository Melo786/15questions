package pack;
import java.util.Arrays;
import java.util.OptionalDouble;

public class tq7 {
    public static OptionalDouble getAverage(int[] ints) {
        OptionalDouble average = Arrays.stream(ints).average();
        return average;
    }

    public static void main(String[] args) {
        int[] averageOf = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(getAverage(averageOf));
    }
}
