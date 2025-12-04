import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        Set<Integer>set=new HashSet<>();
        Set<Integer>set1=new HashSet<>();

        set.retainAll(set1);
        System.out.println(set);

    }
}
