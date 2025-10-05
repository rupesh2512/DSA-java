import java.util.HashSet;
public class BHashSet {
    public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(23);
        // set.add(-28);
        System.out.println("size of set is :: " + set.size());
        set.add(2045);
        System.out.println(set);
        set.remove(-28);
        System.out.println(set);
        set.add(24556);
        set.remove(1);
        System.out.println(set);
        // searching O(1);
        System.out.println("set contai 50 -> "+set.contains(50));
        set.add(50);
        System.out.println("set contai 50-> "+set.contains(50));
        System.out.println("size of set is :: " + set.size());
        set.clear(); // TO clear the set
        System.out.println("size of set is :: " + set.size());

        // All the operations in HashSet are O(1)
        // HashSet does not allow duplicates
        // HashSet does not maintain the order
        // HashSet have followinf functions
        // add(), remove(), contains(), clear(), size(), isEmpty()
        // 
    }
}
