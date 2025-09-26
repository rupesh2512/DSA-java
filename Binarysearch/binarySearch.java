package Binarysearch;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target elwmwnt");
        int[] arr={12,23,43,45,56,67,78,89,90,102,384,677,989,458765};
        int target=sc.nextInt();
        int low=0,hi=arr.length;
        boolean flag=true;
        int x=0;
        while(low<=hi){
            int mid=(low+hi)/2;
            if(arr[mid]<target){
                low=mid+1;
                System.out.println(x);
                x++;
            }
            else if(arr[mid]>target){
                hi=mid-1;
                System.out.println(x);
                x++;
            }
            else if(arr[mid]==target){
                System.out.println("element found at "+mid+"th position and element is "+arr[mid]);
                flag =false;
                break;
            }          
        }
        if(flag == true){
            System.out.println("element not found");
        }
    }
}
