package Shortingalgorithm;

import java.util.Scanner;

public class insersionShort {
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
        int z=arr.length; //no need in case of insersion shorting
        for (int i = 0;i<arr.length;i++) {
            print(arr);
            for (int j=i;j>0;j--) {   //in case of normal insersion shortinfg we will iitiate the j from i and end at [arr.lemgth]
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
                
            }          
        }
        print(arr);
    }
}
