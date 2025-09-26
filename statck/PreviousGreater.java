package statck;

import java.util.Stack;

public class PreviousGreater {
    public static void PreviousGreaterx(int[] arr,int n){
        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        System.out.print(" -1");
        for(int i=1;i<n;i++){
            while ( !st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
                if(st.isEmpty()){
                    System.out.println("-1");
                }
                else {System.out.println(st.peek()+" ");
                st.push(arr[i]);}
            }
        }

    }
    public static void main(String[] args) {
       // Stack<Integer> st=new Stack<>();
           int[] arr={582,67,78,34,45};
           int n= arr.length;
           System.out.println(" dfjkbdskjhcfvgwhjkfvdqswhjbcvadhjksbdvcfhjkqwdefgydf");
           PreviousGreaterx(arr,n);
    }
}
