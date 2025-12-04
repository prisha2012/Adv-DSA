import java.util.*;
public class Q10marker {
    public static int countPairs( int[] deals, int target) {
        int count =0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:deals){
            int c=target-x;
            if(map.containsKey(c)){
                count+=map.get(c);
            }
            map.put(x,map.getOrDefault(x, 0)+1);
        }
        return count;
    }
     public static void main(String[] args) {
        // Example 1
        int[] deals1 = {1, 4, 2, 3, 3, 2};
        System.out.println("Output: " + countPairs(deals1, 5)); 
        // Expected: 5
        
        // Example 2
        int[] deals2 = {2, 2, 2, 2};
        System.out.println("Output: " + countPairs(deals2, 4)); 
        // Expected: 6
        
        // Example 3
        int[] deals3 = {5, 0, 5, 0, 2, 3};
        System.out.println("Output: " + countPairs(deals3, 5)); 
        // Expected: 5
    }
}

