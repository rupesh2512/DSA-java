package statck;

import java.util.Stack;

public class puchElementAtBottom {
    public static void main(String[] args) {
    Stack <Integer> st= new Stack<>();
    Stack <Integer> temp= new Stack<>();
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);
    st.push(60);
    while(!st.isEmpty()){
        temp.push(st.pop());
    }
    st.push(99);
    while(!temp.isEmpty()){
        st.push(temp.pop());
    }
    System.out.println(st);

    }
  
  
}
