package StringRecursion;

public class removeas {
    public static void main(String[] args) {
        String str="baccdah";
        skip("",str);
        String str1 = "bccapplendk";
        System.out.println(skipApple("",str1));
        System.out.println(skipAppNotApple("",str1));





    }
    static void skip(String p,String unp){
        if(unp.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = unp.charAt(0);
        if(ch=='a'){
            skip(p,unp.substring(1));
        }
        else{
            skip(p+ch,unp.substring(1));
        }
    }
    static String skipApple(String p,String unp){
        if(unp.isEmpty()){

            return"";
        }

        if(unp.startsWith("apple")){
            return skipApple(p,unp.substring(5));
        }
        else{
            return skipApple(p+unp.charAt(0),unp.substring(1));
        }
    }
    static String skipAppNotApple(String p,String unp){
        if(unp.isEmpty()){

            return"";
        }
        if(unp.startsWith("app")&&!unp.startsWith("apple")){
            return skipAppNotApple(p,unp.substring(5));

        }



        else{
            return skipAppNotApple(p+unp.charAt(0),unp.substring(1));
        }
    }
}
