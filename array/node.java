package array;

import java.util.ArrayList;
import java.util.List;
class Node{
    int val;
    Node next;
    public Node(int val) {
        val=this.val;
    }
}

public class node {
    public int[][] spiralMatrix(int m, int n, Node head) {
        int[][] ans=new int[m][n];
        int c1=0,c2=m-1,r1=0,r2=n-1;
        int count=0;
        while(head!=null){
            //move right
            for(int i=c1;i<=c2;i++){
                ans[r1][i]=head.val;
                head=head.next;
                count++;
            }
            r1++;
            //move down
            for(int i=r1;i<=r2;i++){
                ans[i][c2]=head.val;
                head=head.next;
                count++;
            }
            c2--;
            // move left
            for(int i=c2;i>=c1;i--){
                ans[r2][i]=head.val;
                head=head.next;
                count++;
            }
            r2--;
            for(int i=r2;i>=r1;i--){
                ans[i][c1]=head.val;
                head=head.next;
                count++;
            }
            c1++;
        }
        return ans;
    }
    static void insert(Node head,int val){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node x=new Node(val);
        temp.next=x;

    }
    static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        int m=3,n=4;
        insert(head, 20);
        insert(head, 22);
        insert(head, 24);
        insert(head, 25);
        insert(head, 28);
        print(head);

    }

}
