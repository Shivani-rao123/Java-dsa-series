package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class reverseArray {

    //two pointer methods
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        System.out.println("Before reverse"+list);
        reverse(list);

        System.out.println("After reverse"+
                list);
    }
    public static void reverse(ArrayList<Integer> list){
        int start =0;
        int end = list.size()-1;
        while(start<end){
            int temp = list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
    }
}
