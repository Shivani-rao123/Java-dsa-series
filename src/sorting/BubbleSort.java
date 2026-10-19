package sorting;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={1,3,5,4,2};
        bubble(arr);


            System.out.print("Sorted "+Arrays.toString(arr));


    }
    static void bubble(int[] arr){
        boolean swap =false;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }


    }
}
