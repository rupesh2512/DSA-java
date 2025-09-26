package c.LinkList;
class list{
    private node head;
    private node tail;
    private int size;
    void insertAtEnd(node head,int val){
        node temp= new node(val);
        if(head==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
}


public class leetcode1721 {
    static node swap(node head,int k){
        node p1=head;
        node slow=head;
        node fast=head;
        for(int i=1;i<k;i++){
            p1=p1.next;
            fast=fast.next;
        }
        System.out.println(p1.val+" 1");
        System.out.println(fast.val+" 2");
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        System.out.println(fast.val+" 3");
        System.out.println(slow.val+" 5");
        int temp=slow.val;
        slow.val=p1.val;
        p1.val=temp;
        return head;
    }
    static void insert(node head,int val){
        node temp=new node(val);
        if(head==null) head=temp;
        else{
            node p=head;
            while(head.next!=null){
                head=head.next;
            }
            head.next=temp;
            head=p;
        }
    }
    static void print(node head){
        node p=head;
        while(head!=null){
            System.out.print(head.val+"  ");
            head=head.next;
        }
        System.out.println();
        head=p;
    }
    static node inserpoint(node headA,node headb){        
        node a=headA;
        node b=headb;
        while(a!=b){
            a = a == null ? headb : a.next;
            b = b == null ? headA : b.next;


        }
        return a;
        

    }

    public static void main(String[] args) {
        node head=new node(1);
        node headb=new node(2);
        node a=new node(3);
        node b=new node(4);
        node c=new node(5);
        node d=new node(8);
        node e=new node(9);
        node f=new node(10);
        node g=new node(10);
        head.next=a;
        a.next=b;
        headb.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        b.next=c;
        c.next=d;
        d.next=e;
        print(head);
        System.out.println();
        print(headb);
        node k= new node(0);
        k=inserpoint(head,headb);
        System.out.println(k.val);
        

    }
}