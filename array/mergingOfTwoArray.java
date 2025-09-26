package array;

import java.util.Scanner;

public class mergingOfTwoArray {
    public static void main(String[] args) {
        Scanner ram=new Scanner(System.in);
        System.out.println("enter the size of first array ");
        int n =ram.nextInt();
        int[] arr1=new int[n];
        System.out.println("enter size of second array ");
        int m =ram.nextInt();
        int[] arr2=new int[m];
        System.out.println("enter shoeted element to first array");
        for(int i=0;i<n;i++){
            arr1[i]=ram.nextInt();
        }
        System.out.println("enter element to 2nd array");
        for(int i=0;i<m;i++){
            arr2[i]=ram.nextInt();
        }
        int[] c =new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j< m){
            if(arr1[i]<=arr2[j]){
                c[k]=arr1[i];
                i++;
            }
            else {
               c[k]=arr2[j]; 
               j++;
            }
            k++;
        }
        if(i==n){
            while(j<arr2.length){
                c[k]=arr2[j];
                j++;k++;
            }
        }
        if(j<m){
            while(j<arr1.length){
                c[k]=arr1[i];
                i++;k++;
            }
        }
        System.out.println("elements are");
        for (int ku : c) {
            System.out.print(ku+"  ");
        }
    }
    
}
