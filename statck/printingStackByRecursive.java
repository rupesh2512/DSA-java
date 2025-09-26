package statck;

import java.util.Stack;

public class printingStackByRecursive {
    public static void printing(Stack <Integer> st){
        if(st.isEmpty()) return;
        int top=st.pop();
        printing(st);
        System.out.println(top);

    }
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        printing(st);
        System.out.println(st);
    }
}
