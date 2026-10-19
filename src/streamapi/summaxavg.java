package streamapi;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class summaxavg {
    public static void main(String[] args) {
        int[] arr ={1,2,3,45};
        int sum = Arrays.stream(arr).sum();
        Arrays.stream(arr).max().ifPresent(System.out::println);
        OptionalDouble average = Arrays.stream(arr).average();
        long count = Arrays.stream(arr).count();
//        System.out.println(Arrays.stream(arr).max().getAsInt());
        System.out.println(Arrays.stream(arr).average().getAsDouble());
    }
}
