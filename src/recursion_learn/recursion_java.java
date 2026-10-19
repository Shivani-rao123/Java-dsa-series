package recursion_learn;

public class recursion_java {
    public static void main(String[] args){
        message(5);
    }

    static void message(int n){
        if (n==0){
            return;
        }

        System.out.println("hello world");
        message(n-1);
    }
}
