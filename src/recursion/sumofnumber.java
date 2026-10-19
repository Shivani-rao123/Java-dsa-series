package recursion;

public class sumofnumber {
    public static void main(String[] args) {
        int ans = digitsum(1342);
        System.out.println(ans);
        int prod = prod(1342);
        System.out.println(prod);



    }
    static int digitsum(int n){
        if(n==0){
            return 0;
        }


        return digitsum(n/10)+(n%10);
    }
    static int prod(int n){
        if(n%10==n){
            return n;//if one digit is remaining return that number

        }


        return digitsum(n/10)*(n%10);
    }
}
