import java.util.*;
public class Q16 {
    public static void main(String[] args) {
        
        int k=7;
        
        Set<Integer> set=new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);

        for(int n:set){
            if(n<k){
                System.out.print(n+" ");
            }
    }
}
}
