package Patterns;

public class Main {
    public static void main(String[] args) {
        pattern1(6);
        System.out.println();
        pattern2(6);
        System.out.println();
        pattern3(6);
        System.out.println();
        pattern4(6);
        System.out.println();
        patterns5(6);

    }
    static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    }  static void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col =1;col<=n;col++){
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    }
    static void pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col =1;col<n-row+1;col++){
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    } static void pattern4(int n){
        for(int row=1;row<=n;row++){
            for(int col =1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();

        }
    }
    static void patterns5(int n){
        for(int row =0;row<2*n;row++){

            int totalCol = row>n?2*n-row-1:row;
            int noSpaces = n-totalCol;
            for(int s=0;s<noSpaces;s++){
                System.out.print(" ");
            }
            for(int col =0;col<=totalCol;col++){

                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patterns6(int n){
        for(int row =0;row<2*n;row++){
            int totalCol = row>n?2*n-row-1:row;
            for(int col =0;col<=totalCol;col++){

                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
