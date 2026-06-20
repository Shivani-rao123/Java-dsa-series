package Shivani;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Q:print number from 1to 5

//        for(int i=1 ;i<=5 ;i++){
//            System.out.println(i);
//        }

        //do-while
//
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//
//        int max = a;
//        if (b > max) {
//            max = b;
//
//        }
//        if (c > max) {
//            max = c;
//        }
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
