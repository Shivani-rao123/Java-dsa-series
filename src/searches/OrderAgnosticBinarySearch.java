package searches;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {


    }
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swapArray(arr,maxIndex,last);
        }

    }
    private static int getMaxIndex(int[] arr, int start, int end){
        int max =start;
        for(int i=start;i<end;i++){
            if(arr[i]>arr[max]){
                max=i;

            }
        }return max;

    }
    static int[] swapArray(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return arr;
    }
    static int binarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        boolean isAsc =arr[start]<arr[end];


        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }
                else if(target>arr[mid]){
                    start = mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end = mid-1;
                }
                else if(target<arr[mid]){
                    start = mid+1;
                }
            }


        }
        return -1;
    }
}
