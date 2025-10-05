import java.util.HashMap;

public class HashMapBasic {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        System.out.println(map);

        System.out.println(map.get("b"));
        System.out.println(map.containsKey("a"));
        System.out.println(map.containsValue(1));
        System.out.println(map.remove("a"));
        System.out.println(map);

        // All the operations in HashMap are O(1)
        // HashMap does not allow duplicates
        // HashMap does not maintain the order
        // HashMap have followinf functions
        // put(), get(), remove(), containsKey(), containsValue(), size(), isEmpty(), keySet(), values(), entrySet()
        // HashMap is in form of key value pair <key , value>
        // key is unique
        // 

        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("kunal", 1);
        map1.put("piyush", 2);
        map1.put("sudanshu", 3);
        map1.put("hemant", 4); 
        System.out.println(map1);
        for(String key : map1.keySet()){
            System.out.println(key+" "+map1.get(key));
        }
        for(Object key : map1.entrySet()){
            System.out.println(key);
        }
    }

}
