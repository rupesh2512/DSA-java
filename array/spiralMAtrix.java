package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class spiralMAtrix {
    public static void Ans(int[][] arr){
        int minr=0,minc=0,k=0,maxr=arr.length-1,maxc=arr[0].length-1;
        while(minc<maxc || minr<maxr){
            for (int j = minc; j <=maxc; j++) {
                System.out.print(arr[minr][j]+" ");
                k++;
            }minr++;
            if(minr>maxr||minc>maxc) break;
            for (int j = minr; j <=maxr; j++) {
                System.out.print(arr[j][maxc]+" ");
                k++;
            }maxc--;
            if(minr>maxr||minc>maxc) break;
            for (int j = maxc; j >= minc; j--) {
                System.out.print(arr[maxr][j]+" ");
                k++;
            }maxr--;
            if(minr>maxr||minc>maxc) break;
            for (int j = maxr; j >= minr; j--) {
                System.out.print(arr[j][minc]+" ");
                k++;
            } minc++;
        }System.out.print(arr[arr.length/2][arr[0].length/2]);
    }
    public static void printf(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        List<Integer> arr1=new ArrayList<Integer>();
        System.out.println("Enter the number of rows: ");
        m = sc.nextInt();
        System.out.println("enter column");
        n=sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("neter valur to arrey "+i+" "+j);
                arr[i][j]=sc.nextInt();
            }
        }
        printf(arr);
        Ans(arr);
    }
}
