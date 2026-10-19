package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.remove(3);
//        System.out.println(list);
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));// pass index here
        }
        System.out.println(list);
    }
}
