import java.util.*;
public class TreeMapB {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(11);
        ts.add(234);
        ts.add(45);
        ts.add(126);
        System.out.println(ts);
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(11,"aman");
        tm.put(234,"binod");
        tm.put(45,"diksha");
        tm.put(126,"DinaNath");
        System.out.println(tm);
    }
}
