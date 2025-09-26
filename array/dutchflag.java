package array;
//only for 0,1,2
import java.util.Scanner;

public class dutchflag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter element to array");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int mid=0,hi=n-1,lo=0;
        while (mid<=hi) {
            if (arr[mid]==0) {
                int tem=arr[mid];
                arr[mid]=arr[lo];
                arr[lo]=tem;
                lo++;mid++;
            }
            else if (arr[mid]==1) mid++;
            else{
                int tem=arr[mid];
                arr[mid]=arr[hi];
                arr[hi]=tem;
                hi--;
            }
        }
        for(int ele:arr) System.out.print(ele+" ");
    }
}
