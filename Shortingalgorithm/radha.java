package Shortingalgorithm;

import java.util.Scanner;

// import c.patternc.numberPiramid;

public class radha {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    
        int limit=sc.nextInt();
        for(int i=0;i<=limit;i++){
            int k=i;
            boolean j;
            j=is_armstrom(k);
            if(j==true) System.out.println(i);
            // System.out.println(i);

        }
    }
    public static boolean is_armstrom(int a) {
        int b=0,c=a,sum=0,l=a;
        while (a>0){
            a=a/10;
            b++;
        }
        
        while(c>0){
            double k=0;
            k=c%10;
            sum+=Math.pow(k, b);
            c=c/10;
        }
        // System.out.println(sum);
        if(sum==l) return true;
        else return false;
    }
}
