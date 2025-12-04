import java.util.*;
public class QTreeMap {
    public static void main(String[] args) {
        Map<String,Integer>map=new TreeMap<>();
        map.put("Three",3);
        map.put("One",1);
        map.put("Four",4);

        for(Map.Entry<String,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
