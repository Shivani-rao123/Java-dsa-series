package basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int ans =0;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter the operator");
            char op = sc.next().trim().charAt(0);
            if(op=='+'||op =='-'||op=='*'||op=='/'||op=='%'){
                System.out.println("Enter the first number ");
                int num1 =sc.nextInt();
                System.out.println("Enter the second number ");
                int num2 =sc.nextInt();
                if(op=='+'){
                    ans=num1+num2;

                }
                else if(op=='-'){
                    ans=num1-num2;
                }
                else if(op=='*'){
                    ans=num1*num2;
                } else if (op=='/') {
                    ans =num1/num2;


                }
                else if(op=='%') {
                    ans=num1%num2;
                }


            }
            else if(op=='x'||op=='X'){
                break;

            }else{
                System.out.println("Invalid operation");
            }
            System.out.println("Ans:"+ans);
        }

    }
}
