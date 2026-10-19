package Arrays;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] =23;
        arr[1] =45;
        arr[2] =23;
        arr[3] =67;
        arr[4] =23;
        System.out.println(arr[3]);

        //input using for loops

        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        for (int j : arr) {
            System.out.println(j + " ");// here j represents element n the array

        }
    }
}
