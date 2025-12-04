import java.util.*;
public class QhashSet1 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,1,2,3};
        Set<Integer>set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        System.out.println(set);
        System.out.println(set.size());

    }
}
