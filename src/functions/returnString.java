package functions;

public class returnString {
    public static void main(String []args){
//        String message =greet();
//        System.out.println(message);
        String name ="Shivani";
        String personalisedmessage =myGreet(name);
        System.out.println(personalisedmessage);

    }

    private static String myGreet(String name) {
        String message = "hello "+name;
        return message;
    }

    public static String  greet(){
       String greeting="how are you";
       return greeting;

    }
}
