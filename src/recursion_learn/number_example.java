package recursion_learn;

public class number_example {
    public static  void main(String[] args){
        //write a function that takes in a number and prints it
        // print first 5 number
        printnumber(5);


    }
    static  void printnumber(int n){
        if(n==0){
            return;
        }

        printnumber(n-1);
        System.out.println(n);
    }
}
