import java.util.PriorityQueue;

public class basic {
    public static void main(String[] args) {
        // min heap
        // max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(30);
        System.out.println(pq);
        pq.add(20);
        pq.add(40);
        pq.add(50);
        System.out.println(pq);
        pq.remove();
        pq.poll();  //both poll and remove are same
        System.out.println(pq);
        pq.add(2);
        System.out.println(pq);
        pq.add(-2);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.size());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

        // priority queue in java
        // min heap
        // all the operations are O(log n)
        // O(1) for peek
        // O(n) for poll
        // O(n) for remove
        // all functions in heap ar following->
        // add(element) -> O(log n)
        // remove() -> O(log n)
        // poll() -> O(log n)
        // peek() -> O(1)
        // size() -> O(1)
        // isEmpty() -> O(1)
    }
    
}
