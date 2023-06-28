import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        System.out.println("Before"+map.size());
        map.put(1,"abc");
        map.put(2,"abc");
        System.out.println("Middle"+map.size());
        map.put(1,"abc");
        map.put(1,"abc");
        map.put(1,"abc");
        map.put(1,"abc");
        System.out.println("After"+map.size());
    }
}
