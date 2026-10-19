package String;

import java.math.BigInteger;

public class large_numbers {
    public static void main(String[] args){
        int a= 30;
        int b= 67;

        BigInteger A= BigInteger.valueOf(33);
        BigInteger B= BigInteger.valueOf(474534323);
        BigInteger C= new BigInteger("343445454");
//converting big integer to int
        int c = B.intValue();


        BigInteger m = C.multiply(A);
        System.out.println("Multiplication: "+m);

        BigInteger subtract = C.subtract(A);
        System.out.println("Subtract: "+subtract);

        BigInteger devide = C.divide(A);
        System.out.println("Devide: "+devide);

        BigInteger reminder = C.remainder(A);
        System.out.println("Reminder: "+reminder);

        if(C.compareTo(A)<0){
            System.out.println("Yes");
        }

        //addition
        BigInteger s = A.add(B);// these are objects i cannot do A+B

        System.out.println(s);
        System.out.println(C);
        System.out.println(Factorial.fact(1234334));




    }
}
