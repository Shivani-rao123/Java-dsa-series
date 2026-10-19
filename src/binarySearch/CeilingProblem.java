package binarySearch;

public class CeilingProblem {
    public static void main(String[] args) {
        int[] arr ={2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(findCeiling(arr,target));

    }
    public static int findCeiling(int[] arr, int target) {
        //what if the target is greater than greates in array
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<target){
                start = mid+1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return start;// to find the floor value make it as end
    }
}
