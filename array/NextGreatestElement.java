package array;

import java.util.Scanner;

public class NextGreatestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter element to array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans =new int[n];
        ans[n-1]=-1;
        //method one
        for(int i=0;i<n-1;i++){
            int mx = Integer.MIN_VALUE;
            for(int j=i+1;j<n;j++){
                mx=Math.max(mx, arr[j]);
            }
            ans[i]=mx;
        }
        System.out.println("according to second method");
        for (int i : ans) {
            System.out.print(i+" ");
        }
        //method 2
        int nge = arr[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i]=nge;
            nge=Math.max(arr[i], nge);
        }
        System.out.println("according to second method");
        for (int j : ans) {
            System.out.print(j+" ");
        }
    }
    
}
