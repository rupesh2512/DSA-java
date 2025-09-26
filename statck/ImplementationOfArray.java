package statck;
class stackx{
    private int[] arr = new int[10];
    private int size=0;
    void push(int a){
        if(size>10) {
            System.out.println("stack is full");
            return;
        }
        arr[size]=a;
        size++;
    }
    int pick(){
        
        return arr[size-1];
    }
    void display(){
        for(int k=0;k<size;k++){
            System.out.print(arr[k]+"  ");
            
        }
        System.out.println();
    }
    int size(){
        return size;
    }
    int pop(){
        if(size==0){
            System.out.println("Stack is empty");
            return -1;
        }
        size--;
        return arr[size];
    }
    boolean isempty(){
        if(size==0) {
            return true;
        }
        else return false;
    }

}

public class ImplementationOfArray {
    public static void main(String[] args) {
        stackx st = new stackx();
        System.out.println(st.isempty());
        st.push(5);
        st.push(9);
        System.out.println(st.isempty());
        st.isempty();
        System.out.println(st.pick());
        System.out.println(st.size());
        st.display();
        System.out.println(st.pop());
        st.display();
        System.out.println(st.size());
        st.isempty();
        st.push(456);
        st.push(567);
        st.display();
        System.out.println(st.size());
        System.out.println(st.isempty());
    }
}
