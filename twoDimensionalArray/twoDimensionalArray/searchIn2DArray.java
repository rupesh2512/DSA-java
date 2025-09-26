package twoDimensionalArray;

import java.util.Scanner;

public class searchIn2DArray {
    public static void print(int[][] arr,int m,int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter dimension of your matrix");
        int n=sc.nextInt();
        int m =sc.nextInt();
        int[][] arr =new int[n][m];
        System.out.println("enter element row wise");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();                
            }
        }
        print(arr, m, n);
        int k=0;
        System.out.println("enter element you want to find ");
        int target=sc.nextInt();
        int i=m-1,j=0;
        while(i>=0&&j<n){
            if(arr[i][j]==target){
                System.out.println("element found at "+i+1 +" "+j+1);
                k++;
                break;
                
            }
            else if(arr[i][j]>target){
                i--;
            }else j++;

        }
        if (k!=1)
       { System.out.println("not found");}
    }
    
}
