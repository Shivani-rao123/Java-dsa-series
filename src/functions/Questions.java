package functions;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
        System.out.println("Enter the number to check armstrong number");
        int arm = in.nextInt();
        System.out.println(amstrong(arm));
    }
    //print all the 3 digit amstrong number
    static boolean amstrong(int n){
        int digit = String.valueOf(n).length();
        int original =n;
        int sum = 0;
        int temp=n;
        while(temp>0){



            int rem =temp%10;

            sum = sum+ (int)Math.pow(rem,digit);
            temp=temp/10;

        }
        return sum == original ;
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while (c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return (c*c>n);
    }
}
