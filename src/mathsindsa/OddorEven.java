package mathsindsa;

public class OddorEven {
    public static void main(String[] args){
        checkEvenOdd(19);
        ithposition(13,2);
        int[] arr={2,3,4,1,2,1,3,6,4};
        int occur =numberoccuronce(arr);
        System.out.println(occur);


    }
    static String checkEvenOdd(int n){
        System.out.println(n+ " in binary =" + Integer.toBinaryString(n));
        if((n&1)==1){
            return n +" is Odd";

        }
        else{return n +" is Even";}
    }
    static int ithposition(int n, int i){
        int a= (n>>i) &1;
        System.out.println(a);
        return a;
    }
    static int numberoccuronce(int[] arr){
        int x=0;
        for(int num:arr){
            x^=num;

        }
        return x;
    }
    static void swapno(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
    }
}
