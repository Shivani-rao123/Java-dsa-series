package String;

import java.util.ArrayList;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a= 433.1234f;
        System.out.printf("Formatted number is %.2f",a);
        System.out.println();
        System.out.println('a'+'b');
        System.out.println((char)('a'+3));
        System.out.println("a"+1);//integer will be converted to inteer tthat will call toString()
        System.out.println("Shivani"+new ArrayList<>());// returning thr empty array
    }
}
