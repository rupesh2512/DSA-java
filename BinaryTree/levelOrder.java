package c.BinaryTree;

import java.util.Scanner;

public class levelOrder {
    static int n=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        node f = new node(6);
        node g = new node(7);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;f.right=g;
        System.out.println("enter the value of n :: ");
        int x;
        for(int i=0;i<=3;i++){
            x=i;
            ntlevel(a, 0,x);
            System.out.println();
        }
        //ntlevel(a,0);
    }
    public static void ntlevel(node root,int r,int x){
        if(root==null) return;
        if(r==x) {
            System.out.print(root.val);
        }
        ntlevel(root.left,r+1,x);   //--->>> To reverse the order like right to left just interchange the line use root.right first.
        ntlevel(root.right,r+1,x);
    }
}
