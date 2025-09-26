package Binarysearch;

import java.util.Scanner;

public class MountainPeakSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to the array");
        int[] arr = {40,48,61,75,100,990,9890,39990,30,10};
        // for (int i : arr) {
        // arr[i]=sc.nextInt();
        // }
        int lo = 0, hi = arr.length,ans=-1;
        while (lo <= hi) {
            int mid = lo + ((hi-lo) / 2);
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                System.out.println("mid is 1 "+mid);
                return;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                lo = mid + 1;
                System.out.println("mid is 2 "+mid);
            } else if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                hi = mid - 1;
                System.out.println("mid is 3 "+mid);
            }
        }
    }
}
