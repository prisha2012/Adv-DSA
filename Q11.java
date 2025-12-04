import java.util.*; 
public class Q11 {
    public static void main(String[] args) {
        Set<Integer>set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(1);
        set.add(5);
        set.removeIf(i->i>10);
        System.out.println(set);
    }
}
