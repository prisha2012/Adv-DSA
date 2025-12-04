import java.util.*;
public class Q18 {
    public static void main(String[] args) {
        String s="hey how are you doing are you okay";
        Map<String,Integer>map=new LinkedHashMap<>();

        for(String str:s.split(" ")){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        System.out.println(map);
    }
}
