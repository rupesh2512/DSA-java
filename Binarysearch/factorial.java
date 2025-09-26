package Binarysearch;

public class factorial {
    long k;
    static int a=2;
    public static int power(int a,int b){
        if (b==0) return 1;
        else return a*power(a, b-1);
    }
    public static void main(String[] args) {
        long k;
        // a=25;
        int b=10;
        System.out.println(power(a,b));
    }
    
}
