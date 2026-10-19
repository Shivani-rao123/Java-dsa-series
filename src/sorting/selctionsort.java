package sorting;

public class selctionsort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 1, 2,3, 9};

        for (int i = 0; i < arr.length; i++) {

            int minIndex = getMaxIndex(arr, i, arr.length);
            swap(arr, i, minIndex);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i=start;i<end;i++){
            if(arr[i]>arr[max]){
                max =i;
            }
        }
        return max;
    }
    static int[] swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return arr;
    }






}
