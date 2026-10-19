package StringRecursion;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class subsetArray {
    public static void main(String[] args){
        int[] arr ={1,2,3};
        int[] arr1 ={1,2,2};
        List<List<Integer>> ans = subsetsDuplicate(arr1);
        for(List<Integer> list:ans){
            System.out.println(list);
        }
        List<List<Integer>> ans1 = subsetsDuplicate(arr);
        for(List<Integer> list:ans1){
            System.out.println(list);
        }

    }
    static List<List<Integer>> subsets(int[] A){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:A){
            int size= outer.size();
            for(int i=0;i<size;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }

        }


        return outer;
    }
    static List<List<Integer>> subsetsDuplicate(int[] A){
        Arrays.sort(A);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end =0;
        //if my current and prev element is same s= e+1
        for(int i=0;i<A.length;i++){
            if(i>0 && A[i]==A[i-1]){
                start = end+1;
            }else{
                start=0;
            }
            end=outer.size()-1;
            int size= outer.size();
            for(int j=start;j<size;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(A[i]);
                outer.add(internal);
            }

        }


        return outer;
    }
}
