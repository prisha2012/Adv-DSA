import java.util.*;


public class Qmap1 {
    public static void main(String[] args) {
        String str="bannana";
        Map<Character,Integer>map= new HashMap<>();

        for( char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
}
