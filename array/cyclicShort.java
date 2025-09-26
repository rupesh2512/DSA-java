package c.array;

import java.util.Arrays;

class cyclicShort {
    public static void swape(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        }
    public static void main(String[] args) {
        int[] arr = {6, 2, 4, 1, 5, 4};
        int i=0;
        while (i < arr.length) {
            if (arr[arr[i]-1] != arr[i]) {
                swape(i, arr[i]-1, arr);
            } else {
                i++;
            }
        }
        int[] ans = new int[2];
        for (int index=0; index < arr.length; index++) {
            if (arr[index] != index+1){
                ans[0] = arr[index];
                ans[1] = index+1;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}