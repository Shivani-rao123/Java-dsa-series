package searches;

public class EvenDigit {
    public static void main(String[] args) {
        int nums[]= {18,124,9,1764,98};
        System.out.println(FindNubers(nums));

    }
    static int FindNubers(int[] nums){
        int count =0;
        for(int n:nums){
            if (even(n)){
                count++;
            }
        }
        return count;
    }
    //function to check
    static boolean even(int num){
        int numberOfDigits= digits(num);
        return numberOfDigits%2==0;
    }
    static int  digits(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        int count =0;
        while(num>0){
            count++;
            num =num/10;
        }
        return count;

    }
}
