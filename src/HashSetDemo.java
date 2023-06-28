import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        System.out.println("before"+hashSet.size());
        hashSet.add("abc");
        hashSet.add("abc");
        System.out.println("middle"+hashSet.size());
        hashSet.add("abcd");
        hashSet.add("abc");
        hashSet.add("abc");
        System.out.println("after"+hashSet.size());
    }
}
