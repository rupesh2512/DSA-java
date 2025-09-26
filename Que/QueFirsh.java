package Que;

import java.util.LinkedList;
import java.util.Queue;

public class QueFirsh {
    private static final String que = null;
    static void removingEven(){
        while(!que.isEmpty()){
            
        }
    }
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        Queue<Integer> newque = new LinkedList<>();
        System.out.println(que.isEmpty());
        que.add(9);
        que.add(1245);
        que.add(95);
        que.add(9564);
        que.add(9456);
        que.add(94212);
        System.out.println(que);
        que.remove();
        System.out.println(que);
        que.poll();
        System.out.println(que);
        System.out.println(que.peek());
        System.out.println(que.size());
        System.out.println(que.isEmpty());

    }
}
