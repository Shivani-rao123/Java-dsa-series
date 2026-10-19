package streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class mapfilters {
    public static void main(String[] args){
        List<Integer> nums = List.of(1,2,3,4,5,6);

        List<Integer> result = nums.stream()
                .filter(x->x%2==0)
                .map(x->x*x)
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
