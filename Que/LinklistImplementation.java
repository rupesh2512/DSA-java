package Que;

import statck.puchElementAtBottom;

class Node{
    int val;
    Node next;
    Node (int val){
        this.val=val;
    }
}
class que{
    Node head = null;
    Node tail = null;
    int size =0;
    public void add(int val){
        Node temp= new Node(val);
        if (size == 0) head = tail = temp;
        else {
            tail.next =temp;
            tail=temp;
        }
        size++;
    }
    public void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.val);
            temp=temp.next;
        }
        System.out.println();
    }
    public int size(){
        return size;
    }
    public int peek(){
        if (size==0){
            System.out.println("Empty queue");
        }
        return head.val;
    }
    public void remove(){
        if(size==0){
            System.out.println("It is empty");
        }
        size--;
        head=head.next;
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        else return false;
    }

}

public class LinklistImplementation {
    public static void main(String[] args) {
        que a=new que();
        a.add(89);
        a.add(56);
        a.add(567);
        a.add(567);
        a.add(567);
        a.add(55);
        a.add(7);
        a.add(527);
        a.add(57);
        a.add(67);
        System.out.println(a.size);
        a.display();
        a.remove();
        a.display();
        System.out.println(a.peek());
        System.out.println(a.size);
        System.out.println(a.isEmpty());
    }
}
