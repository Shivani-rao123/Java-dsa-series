package searches;

import java.util.Arrays;

public class SearchinString {
    public static void main(String[] args) {
            String name ="Shivani";
            char target ='v';
        System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static  boolean search(String str,char target){
        if(str.length()==0){
            return false;

        }
//        for(int i=0;i<str.length();i++){
//            if(target == str.charAt(i)){
//                return true;
//            }
//        }
        for(char ch : str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;

    }

    public class selectonsortdesc {
        public static void main(String[] args) {
            int[] arr ={3,5,2,1,4};
            for(int i=0;i<arr.length;i++){
                int last = arr.length-i-1;
                int minIndex = getminIndex(arr,0,last);
                swap(arr,minIndex,last);
            }
        }
    }
}
