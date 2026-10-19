package StringRecursion;

public class permutations {
    public static  void main(String[] args){
        permutation("","abc");
        System.out.println(permutationCount("","abc")
);
    }
    static void permutation(String p, String unp){
        if (unp.isEmpty()) {

            System.out.println(p);
            return;
        }
        char ch = unp.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutation(f+ch+s,unp.substring(1));
        }
    }
    static int permutationCount(String p, String unp){
        if (unp.isEmpty()) {


            return 1;
        }
        int count =0;
        char ch = unp.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count +permutationCount(f+ch+s,unp.substring(1));
        }
        return count;
    }
}
