import java.util.*;
public class QLinkedHashMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new LinkedHashMap<>();
        map.put("Aman",85);
        map.put("Prisha",95);
        map.put("Riya",90);

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
