import java.util.Scanner;

public class switchpractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit=sc.next();
        switch (fruit){
            case "Mango":
                System.out.println("king of fruit");
                break;
            case "Apple":
                System.out.println("sweet red fruit");
                break;
            case  "Banana":
                System.out.println("cherry fruit");
                break;
            case "Orange":
                System.out.println("peach fruit");
                break;
            default:
                System.out.println("fruit not found");
        }


    }
}
