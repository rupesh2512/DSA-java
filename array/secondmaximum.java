package array;

import java.util.Scanner;

public class secondmaximum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            System.out.println("enter element no : "+(i+1));
            arr[i]=sc.nextInt();
        }
        int max= arr[0];
        int max2=0;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max2 && arr[i]!=max){
                max2=arr[i];
            }
        }
        System.out.println(max2+(" is the maximum number"));
    }
    
}
