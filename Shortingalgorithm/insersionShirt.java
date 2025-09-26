package Shortingalgorithm;

import java.util.Scanner;
//int this cae no other optimal solution is available
//
public class insersionShirt {
    public static void print(int[] ar) {
        for (int i:ar) {
            System.out.print(i+" ");
        }        
        System.out.println();
    }
    public static void swap(int[] ar, int minind,int i) {
        int temp=ar[i];
        ar[i]=ar[minind];
        ar[minind]=temp;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr={5,3,56,9,6,2,23,43};
        print(arr);
        System.out.println(arr.length);
        int z=arr.length; //no need in case of insersion shorting
        for (int i = 0;i<arr.length-1;i++) {
            int max=Integer.MIN_VALUE;
            int mindex=-1;
            print(arr);
            for (int j=0;j<z;j++) {   //in case of normal insersion shortinfg we will iitiate the j from i and end at [arr.lemgth]
                if(max<arr[j]){
                    max=arr[j];
                    mindex=j;
                }
                
            }
            z--; //this willnot be in case of insersion shorting
            swap(arr,mindex,z);
            
        }
        print(arr);
    }
    
}
