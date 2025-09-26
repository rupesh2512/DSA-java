package c.LinkList;

import org.w3c.dom.Node;

class node{
    int val;
    node next;
    node(int val){
        this.val=val;
    }
}
public class DeclearationAndPrinting {
    // first is to print using alll the available nodes by knowing numbers of element present
    // static void print(node a){
    //     node temp=a;
    //     while(temp!=null){
    //         System.out.println(temp.val);
    //         temp=temp.next;
    //     }
    // }
    public static void print(node a){
        if (a==null) return;
        print(a.next);
        System.out.println(a.val);
        return;
    }
    public static void main(String[] args) {
        node a=new node(10);
        node b=new node(11);
        node c=new node(10);
        node d=new node(110);
        node e=new node(120);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        print(a);
        System.out.println(a.val);
    }
}
