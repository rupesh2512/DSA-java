package Binarysearch;

public class normalFibo {
    public static void main(String[] args) {
        long a=0,b=1,c=0;
        int n=1;
        for (int i=0;i< n-1 ; i++){
            System.out.println(a);
            long temp=a+b;
            a=b;
            b=temp;
        }
        System.out.println(a);
    }    
}
