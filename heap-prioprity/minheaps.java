import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

import array.arr;

public class minheaps {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(20);
        System.out.println(pq);
        pq.add(30);
        System.out.println(pq);
        pq.add(10);
        System.out.println(pq);
        pq.add(40);
        System.out.println(pq);
        pq.add(50);
        System.out.println(pq);
        pq.clear();
        System.out.println(pq);
        int arr[] = {20,30,10,40,50,60,70,-80,90,-100,110,120,130,140,-150,160,170,180,190,200};
        int k =10;
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                pq.remove();
            }
        }
        System.out.println(pq.peek());

        int arr1[]= {6, 5, 3, 2, 8, 10, 9};
        int x = 3;
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        System.out.println("\nArray before sorting : ");
        for(int ele : arr1){
            System.out.print(ele+" ");
        }
        int l;
        for(l=0;l<arr1.length;l++){
            pq1.add(arr1[l]);
            if(pq1.size()>x){
                arr1[l-x] = pq1.remove();
            }
        }
        // System.out.println("\n"+l);
        // System.out.println(pq1);
        while(!pq1.isEmpty()){
            arr1[l-x] = pq1.remove();
            // System.out.println(l);
            l++;
        }
        System.out.println("\n Array after sorting : ");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\n");


        Arrays.sort(arr);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n"+arr[k]);


    }
}
