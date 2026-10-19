package searches;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr= {18,12,-7,3,14,28};
        System.out.println(LinearSearch(arr,-7,1,4));

    }
    static int LinearSearch(int[] arr, int key,int start,int end) {
        if(arr.length == 0){
            return -1;
        }
        for(int i=start;i<end;i++){
            int element = arr[i];
            if(element == key){
                return i;

            }
        }
        return -1;

    }
}
