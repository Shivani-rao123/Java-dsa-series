package functions;

import java.util.Scanner;

public class methodsandclasses {
    public  static void main(String []args){
        //Q.tak input of two numbers and prin the sum
     sum();



    }
    public static void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1=sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2=sc.nextInt();
        int sum = num1+num2;
        System.out.println("Sum:"+sum);
    }
}
