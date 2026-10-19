package functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b= 20;
        {
            a=78;// already initialized outside the block we cannot initialize again but we can change

            int c =99;
            //values intialized in this block remains in this block
        }
        int c= 900;


    }
    static void random(int marks){
        int num =67;
        System.out.println(num);
        System.out.println(marks);
    }


}

