package StringRecursion;

import java.util.ArrayList;

public class substring {
    public static void main(String[] args) {
          subseg("","abc");
        System.out.println(subSeg("","abc"));
        subseqascii("","abc");
    }
    static void subseg(String p, String unp){
        if(unp.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = unp.charAt(0);
        subseg(p+ch,unp.substring(1));
        subseg(p,unp.substring(1));


    }
    static ArrayList<String> subSeg(String p, String unp){
        if(unp.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = unp.charAt(0);
        ArrayList<String>left=subSeg(p+ch,unp.substring(1));
        ArrayList<String>right=subSeg(p,unp.substring(1));

        left.addAll(right);
        return left;

    }
    static void subseqascii(String p, String unp){
        if(unp.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = unp.charAt(0);
        subseqascii(p+ch,unp.substring(1));
        subseqascii(p,unp.substring(1));
        subseqascii(p+(ch+0),unp.substring(1));

    }
}
