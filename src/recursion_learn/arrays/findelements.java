package recursion_learn.arrays;

import java.util.ArrayList;

public class findelements {
    public static void main(String[] args){
        int[] arr={1,2,3,4,4,6};
        System.out.println(find(arr,3,0));
        System.out.println(findindex(arr,2,0));
        System.out.println(findIndexLast(arr,4,arr.length-1));
        findAllindex(arr,4,0);
        System.out.println(list);
        ArrayList<Integer>ans = new ArrayList<>();
        System.out.println(funclist(arr,4,0,ans));

    }
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index]== target|| find(arr,target,index+1);
    }
    static int findindex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if( arr[index]== target){
            return index;
        }
        return findindex(arr,target,index+1);
    }
    static int findIndexLast(int[] arr, int target, int index){
        if(index ==-1){

        }
        if (arr[index]== target){
            return index;
        }
        else{
            return findIndexLast(arr,target,index-1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllindex(int[] arr, int target, int index){
        if(index == arr.length){
            return ;
        }
        if( arr[index]== target){
            list.add(index);
        }
        findAllindex(arr,target,index+1);
    }
    static ArrayList<Integer> funclist(int[] arr, int target, int index, ArrayList<Integer>list){
        if(index == arr.length-1){
            return list;
        }
        if(target==arr[index]){
            list.add(index);
        }
        return funclist(arr,target,index+1,list);
    }
    static ArrayList<Integer> funclist2(int[] arr, int target, int index){
        ArrayList<Integer>list =new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        //this will contain answer for that function call only
        if(target==arr[index]){
            list.add(index);
        }
        ArrayList<Integer> ansfromBelowCalls = funclist2(arr,target,index+1);
        list.addAll(ansfromBelowCalls);
        return list;

    }
}
