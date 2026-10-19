package basics;

public class frquencyinno {
    public  static void main(String[] args) {
        int count = 0;
        int n=1385757879;
        while(n>0){
            int rem = n%10;
            if(rem==7){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
