package Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = new String[3];
        for(int i=0;i<str.length;i++){
            str[i]=in.next();

        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1]="Shivani";
        System.out.println(Arrays.toString(str));

    }
}
