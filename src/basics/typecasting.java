package Shivani;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num =(int)(67.56f);
        System.out.println(num);

        //automatic type promotion in expressions

        int a= 257;
        byte b = (byte) (a); //257%256 =1


        System.out.println(b);
        int number = 'a';//returnsthe number ascii value


        System.out.println(number);




    }
}
