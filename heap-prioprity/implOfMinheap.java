import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;

class minheap{
    private int arr[];;
    private int size;
    minheap(int cap){
        arr = new int[cap];
        size = 0;
    }
    public void add(int data)throws Exception{
        if (size==arr.length) throw new Exception("heap is full");
        arr[size++] = data;
        uphepefify(size-1);
    }
    private void uphepefify(int idx) {
        if(idx==0) return;
        int p = (idx-1)/2;
        if(arr[idx]<arr[p]){
            int temp = arr[idx];
            arr[idx] = arr[p];
            arr[p] = temp;
            uphepefify(p);
        }
    }
    private void downhepefify(int idx) {
        int lc = 2*idx+1;
        int rc = 2*idx+2;
        int minidx = idx;
        if(lc<size && arr[lc]<arr[minidx]) minidx = lc;
        if(rc<size && arr[rc]<arr[minidx]) minidx = rc;
        if(minidx==idx) return;
        int temp = arr[idx];
        arr[idx] = arr[minidx];
        arr[minidx] = temp;
        downhepefify(minidx);
    }
    public int size(){
        return size;
    }
    public int peek()throws Exception{
        if(size==0) throw new Exception("heap is empty");
        return arr[0];
    }
    public int pool()throws Exception{
        if(size==0) throw new Exception("heap is empty");
        int data = arr[0];
        arr[0] = arr[--size];
        downhepefify(0);
        return data;
    }
    // private void downhepefify(int i) {
        
    // }

}

public class implOfMinheap {
    public static void main(String[] args) throws Exception {
        // int arr[] = {1,2,3,4,5,6,7,6,2,8};
        minheap pq = new minheap(10);
        pq.add(10);
        pq.add(20);
        System.out.println(pq.size());
        pq.add(30);
        pq.add(40);
        System.out.println("first poll:"+pq.pool());
        pq.add(50);
        pq.add(60);
        pq.add(70);
        pq.add(80);
        pq.add(90);
        pq.add(2);
        pq.add(3);
        System.out.println("size is "+pq.size());
        System.out.println("second poll:"+pq.peek());
        System.out.println("size is "+pq.size());
        System.out.println("third poll:"+pq.pool());
        System.out.println("size is "+pq.size());
        System.out.println("fourth poll:"+pq.pool());
        System.out.println("last poll:"+pq.pool());
        
    }
    class triplet implements Comparable<triplet>{
        int elem,row,col;
        triplet(int elem,int row,int col){
            this.elem = elem;
            this.row = row;
            this.col = col;
        }
        public int compareTo(triplet t){
            return this.elem-t.elem;
        }
    }
    public int[] smallestRange(List<List<Integer>> nums) {
        int ans[] = {0,Integer.MAX_VALUE};
        PriorityQueue<triplet> pq = new PriorityQueue<>();
        int k = nums.size();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            int ele = nums.get(i).get(0);
            pq.add(new triplet(ele,i,0));
            max = Math.max(max,ele);
        }
        while(true){
            triplet t = pq.poll();
            if(t.row==k-1) break;
            int ele = nums.get(t.row).get(t.col+1);
            pq.add(new triplet(ele,t.row,t.col+1));
            max = Math.max(max,ele);
            if(max-t.elem<ans[1]-ans[0]){
                ans = new int[]{t.elem,max};
            }
        }
        return ans;
    }
}
