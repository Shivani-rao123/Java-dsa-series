package String;
import java.util.*;

import java.util.Collections;
import java.util.Scanner;

public class reversestringremovingspace {
    public static void main(String[] args) {
        String str = " Helloo   World   ";
        System.out.println(reverseWord(str));

    }
    public static String reverseWord(String str){
        String words[] =str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i= words.length-1;i>=0;i--){
            result.append(words[i]);
            if(i!=0){
                result.append(" ");
            }
        }
        return result.toString();
    }
}
