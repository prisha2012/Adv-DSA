import java.util.*;
public class QTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer>set=new TreeSet<>();
        set.add(50);
        set.add(20);
        set.add(30);
        set.add(70);

        System.out.println(set);
        System.out.println(set.first());
        System.out.println(set.last());

    }
}
