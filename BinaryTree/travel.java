package c.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class travel {
    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        node f = new node(6);
        node g = new node(7);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right=g;
        preorderdisplay(a);
        System.out.println();
        inOrderdisplay(a);
        System.out.println();
        postOrderisplay(a);
        System.out.println();
        System.out.println("printing in levelOrder :: ");
        levelOrder(a);
    }

    // -->> BFS
    static void levelOrder(node root){
        Queue<node> q = new LinkedList<>();
        if(root!=null) q.add(root);

        while(q.size()>0){
            node front = q.remove();
            System.out.print(front.val+" ");
            // int preorder[]= new int[2];
            
            if(front.left != null) q.add(front.left);
            if(front.right != null) q.add(front.right);
        }
        
    }

    // -->> DFS
    static void preorderdisplay(node root){
        if(root==null) return;
        System.out.print(root.val+"  ");
        preorderdisplay(root.left);
        preorderdisplay(root.right);
    }
    static void inOrderdisplay(node root){
        if(root==null) return;
        
        inOrderdisplay(root.left);
        System.out.print(root.val+"  ");
        inOrderdisplay(root.right);
    }
    static void postOrderisplay(node root){
        if(root==null) return;
        
        postOrderisplay(root.left);
        postOrderisplay(root.right);
        System.out.print(root.val+"  ");
    }
}
