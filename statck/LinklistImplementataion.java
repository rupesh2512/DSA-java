package statck;
class node{
    int val;
    node next;
    node(int val){
        this.val=val;
    }
}
class Nodex{
    int val;
    Nodex next;
    Nodex(int val){
        this.val=val;
        this.next=null;
    }
}
class stack{
    Nodex head=null;
    int size=0;
    void push(int val){
        Nodex temp=new Nodex(val);
        size++;
        temp.next=head;
        head=temp;

    }
    void display(){
        dis(head);
        System.out.println();
    }
    private static void dis(Nodex a){
        if (a==null) return;
        dis(a.next);
        System.out.print(a.val+" ");
        return;
    }   
    int sizeIs(){
        return size;
    }
    int pop(){
        if(head==null){
            System.out.println("it is empty");
            return -1;
        }
        else{
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }
    }
    int peak(){
        if(head==null){
            System.out.println("it is empty");
            return -1;
        }
        else{
            int x=head.val;
            return x;
        }
    }
    boolean isEmpty(){
        if(size==0||head==null) return true;
        else return false;
    }


}
public class LinklistImplementataion {
    public static void main(String[] args) {
        stack st=new stack();
        System.out.println(st.isEmpty());
        st.push(456);
        st.push(2);
        st.push(45);
        st.push(78);
        st.push(12);
        System.out.println(st.sizeIs());
        st.display();
        System.out.println(st.sizeIs());
        System.out.println(st.pop());
        st.display();
        System.out.println(st.sizeIs());
        System.out.println(st.isEmpty());

    }
}
