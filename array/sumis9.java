package array;

import java.util.Scanner;

public class sumis9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter values to array");
        int[] arr =new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter element no "+(i+1));
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<(arr.length)-1;i++){
            for(int j=1+i;j<arr.length;j++){
                if(arr[i]+arr[j]==9) System.out.println(i+1+"  "+(j+1));
            }
        }
    }
    
}
