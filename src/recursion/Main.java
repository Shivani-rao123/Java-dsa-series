package recursion;

public class Main {
    public static void main(String[] args) {
        //write a function that prints helloworld
        message(10);
    }
    static void message(int count){
        if(count<=0){
            return ;
        }

        System.out.println("Hello world");
         message(count-1);
    }
}
