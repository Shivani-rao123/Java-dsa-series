package mathsindsa;

public class palindromestring {
    public static void main(String[] args){
        String str = "RADAR";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str){
        char[] c = str.toCharArray();
        int left =0;
        int right = c.length-1;
        while(left<right){
            if(c[left]!=c[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
