package basics;

import java.util.Scanner;

public class switchpractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit=sc.next();
        switch (fruit) {
            case "Mango" -> System.out.println("king of fruit");
            case "Apple" -> System.out.println("sweet red fruit");
            case "Banana" -> System.out.println("cherry fruit");
            case "Orange" -> System.out.println("peach fruit");
            default -> System.out.println("fruit not found");
        }


    }
}
