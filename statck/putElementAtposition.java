package statck;

import java.util.Stack;

public class putElementAtposition {
    public static void main(String[] args) {
    Stack <Integer> st= new Stack<>();
    Stack <Integer> temp= new Stack<>();
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);
    st.push(60);
    int size=3;
    System.out.println(st);
    while(st.size()>=size){
        temp.push(st.pop());

    }
    st.push(99);
    while(!temp.isEmpty()){
        st.push(temp.pop());
    }
    System.out.println(st);
    }
}
