package c.LinkList;
class SLL{
    private node head;
    private node tail;
    private int size;
    void insertAtEnd(int val){
        node temp= new node(val);
        if(head==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void insertAtHead(int val){
        node temp= new node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;            
        }
        System.out.println();
    }
    void size (){
        System.out.println("size is "+size);
    }
    void InsertAt(int b,int val){
        if(b==0) {
            insertAtHead(val);
            return;
        }
        if(b==size) {
            insertAtEnd(val);
            return;
        }
        if(b>size){
            System.out.println("invalid position to enter");
            return;
        }
        node temp =new node(val);
        node z=head;
        for (int i = 0; i < b-1; i++) {
            z=z.next;
        }
        temp.next=z.next;
        z.next=temp;
        size++;

    }
    int get(int ind) throws Error{
        if(ind==size-1)return tail.val;
        if(ind<0||ind>size){
            throw new Error("bhai error hai DEkh le 1 bar");
        }
        node temp=head;
        for (int i = 0; i < ind; i++) {
            temp=temp.next;
            
        }
        return temp.val;
    }
    void set(int b,int val){
        if(b==size-1) {
            tail.val=val;
            return;
        }
        if(b>size||b<0){
            System.out.println("invalid position to enter");
            return;
        }
        node temp=head;
        for (int i = 0; i < b; i++) {
            temp=temp.next;
        }
       temp.val=val;
    }
    void DeleteAtHead()throws Error{
        if (head== null) throw new Error("bhaiya ji ye na ho sakta ");
        head=head.next;
        size--;
    }
    void DeletAt(int idx) throws Error{
        if(idx==0){
            DeleteAtHead();
            return;
        }
        if(idx<0||idx>=size) {
            throw new Error("invalid index");
        }
        node temp=head;
        for (int i = 1; i < idx; i++) {
            temp=temp.next;
        }
        if (temp.next==tail) tail=temp;
        temp.next=temp.next.next;
        size--;
    }
}
public class Implimentation {
   
    public static void main(String[] args) {
        SLL a=new SLL();
        a.size();
        a.insertAtEnd(3);
        a.insertAtEnd(23);
        a.insertAtEnd(33);
        System.out.println(a.get(2));
        a.InsertAt(2,233);
        a.set(2, 66);
        a.insertAtEnd(323);
        a.print();
        a.insertAtHead(383);
        a.print();
        a.size();
        System.out.println("value at "+a.get(3));
        a.DeleteAtHead();
        a.print();
        a.DeletAt(2);
        a.print();
        
        
    }
}
