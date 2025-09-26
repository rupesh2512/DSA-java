class node{
    int val;
    node next;
    node(int val){
        this.val = val;
    }
}
public class naya {
    static int[][] spm(int m, int n,node head) {
        int[][] ans = new int[m][n];
        int c1 = 0, c2 = n - 1, r1 = 0, r2 = m - 1;
        int count = 0;
        while (count<(m*n)) {
            // move right
            if(r1>r2||c1>c2) break;
            for (int i = c1; i <= c2; i++) {
                if(head!=null){
                    ans[r1][i] = head.val;
                    System.out.println(head.val);
                    head = head.next;
                } 
                else{
                    ans[r1][i] = -1;
                }
                count++;
            }
            r1++;
            if(r1>r2||c1>c2) break;
            // move down
            for (int i = r1; i <= r2; i++) {
                if(head!=null){
                    ans[i][c2] = head.val;
                    head = head.next;
                } 
                else {
                    ans[i][c2]= -1;
                }
                count++;
            }
            c2--;
            if(r1>r2||c1>c2) break;
            // move left
            for (int i = c2; i >= c1; i--) {
                if(head!=null){
                    ans[r2][i] = head.val;
                    head = head.next;
                } 
                else{
                    ans[r2][i] = -1;
                }
                count++;
            }
            r2--;
            if(r1>r2||c1>c2) break;
            // move up
            for (int i = r2; i >= r1; i--) {
                if(head!=null){
                    ans[i][c1] = head.val;
                    head = head.next;
                } 
                else {
                    ans[i][c1] = -1;
                }
                count++;
            }
            c1++;
        }
        return ans;
    }

    static void insert(node head, int val) {
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        node x = new node(val);
        temp.next = x;

    }
    static node remove(node head,int value){
        node temp1=new node(-1);
        temp1.next=head;
        node temp=temp1;
        while(temp.next!=null){
            if(temp.next.val!=value){
                temp=temp.next;               
            }else{
                temp.next=temp.next.next;
            }
            
        }
        return temp1.next;
    }

    static void print(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        node head = new node(1);
        int m = 1, n = 4;
        insert(head, 2);
        insert(head,3);
        insert(head, 4);
        insert(head, 5);
        insert(head, 6);
        insert(head, 28);
        insert(head, 28);
        insert(head, 28);
        insert(head, 0);
        insert(head, 5);
        insert(head, 28);
        insert(head, 28);
        print(head);
        System.out.println();
        head=remove(head, 6);
        print(head);
        head=remove(head, 28);
        System.out.println();
        print(head);
        
    }

}
