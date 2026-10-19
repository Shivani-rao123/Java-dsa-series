package basics;

import java.util.HashMap;

public class frequencyofeachno {
    public static void main(String[] args) {
        long n= 1122555663;
        String numstr = String.valueOf(n);
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:numstr.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            n=n/10;
        }
        for(char key: map.keySet()){
            System.out.println(key+":"+map.get(key));
        }
    }
}
