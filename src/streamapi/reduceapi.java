package streamapi;

import java.util.List;

public class reduceapi {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,45);
        int sum = nums.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
