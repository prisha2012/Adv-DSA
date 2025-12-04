import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(50);
        list.add(60);
        Set<Integer>set=new HashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println(list);
    }
}
