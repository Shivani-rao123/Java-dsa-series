package streamapi;

import java.util.List;

public class match {
    public static void main(String[] args) {
        List<Integer>nums = List.of(1,2,3,45);
        boolean hasEven = nums.stream().anyMatch(x->x%2==0);
        boolean allPositive = nums.stream().allMatch(x->x>0);
        boolean noneNegative = nums.stream().noneMatch(x->x<0);
        System.out.println(hasEven);
        System.out.println(allPositive);
        System.out.println(noneNegative);

    }
}
