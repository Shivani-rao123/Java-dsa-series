package functions;

import java.util.Arrays;

public class Vararg {
    public static void main(String[] args) {
        fun();
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
