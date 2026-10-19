package String;

import java.text.DecimalFormat;

public class large_strings {
    public static void main(String[] args){
        //constructor 1
        StringBuffer sb = new StringBuffer();

        //constructor 2
        StringBuffer sb2 = new StringBuffer("Shivanii");

        //constructor 3

        StringBuffer sb3 = new StringBuffer(30);


        sb.append("WeMakeDevs");// it will modify that object only
        sb.append("is nice");

        sb.insert(2," Rahul ");

        sb.replace(1,5,"Shivani");
        //mention start end an what to replace
        sb.reverse();
        System.out.println(sb.capacity());

        //removing whitespaces

        String sentence ="Hih jihi jifhwi";
        System.out.println(sentence.replaceAll("\\s",""));
        System.out.println(sentence.split(""));

      //rounding off
        DecimalFormat df = new DecimalFormat("0.00000");
        System.out.println(df.format(7.2));


        String str = sb.toString();
        System.out.println(str);
    }
}
