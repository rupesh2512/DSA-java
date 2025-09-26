package c.LinkList;

import java.util.Scanner;

public class list3217 {
    static void print(node head){
        node temp=head;
        while (temp!=null){
            System.out.print(temp.val+"  ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static node deleteMiddle(node head) {
        node s1=head;
        node s2=head;
        node t1;
        while(s1.next!=null&& s2.next!=null){
            t1.next=s1.next.next;
        }
        return head;
        
    }

    public static void main(String[] args) {
        node head=new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(40);
        head.next.next.next.next=new node(50);
        head.next.next.next.next.next=new node(60);
        head.next.next.next.next.next.next=null;
        print(head);
        node k=deleteMiddle(head);
        print(k);

 


    }
}
