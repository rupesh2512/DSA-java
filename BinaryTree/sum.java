package c.BinaryTree;

public class sum {
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
        System.out.println(sum(a));
    }
    private static int sum(node root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
}
