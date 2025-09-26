package Shortingalgorithm;

public class Bubbleshort {
    public static void print(int[] ar) {
        for (int i:ar) {
            System.out.print(i+" ");
        }        
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={5,3,2,4,9,7,8};
        print(arr);
        // bubble short   best way 
        //if flag get removed it is second best way
        //if second loop word for (arr.length -1) times then it is worst way
        for(int i=0;i<(arr.length)-1;i++){
            boolean flag = true;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if (flag==true) break;
        }
        print(arr);
    }
    
}
