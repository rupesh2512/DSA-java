package c.BinaryTree;
class node{
    int val;
    node left;
    node right;
    node(int val){
        this.val=val;
    }
}
public class Nodetree {
    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(4);
        node c = new node(3);
        node d = new node(2);
        node e = new node(6);
        node f = new node(9);
        node g = new node(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;f.right=g;



        System.out.println(a.left.val);
        System.out.println(b.val);
        System.out.println(display(a));
        System.out.println("max value is "+max(a));
        System.out.println("size id :: " +size(a));
        System.out.println("level id :: "+level(a));
    }
    static int level(node root){
        if(root == null) return 0;
        return 1+Math.max(level(root.left), level(root.right));
    }
    static int display(node root){
        int sum=0;
        if(root==null) return 1;
        sum=+root.val+display(root.left)+display(root.right);
        
        return sum;
        
    }
    static int max(node root){
        if(root==null)return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left), max(root.right)));
        
    }
    static int size(node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
}
