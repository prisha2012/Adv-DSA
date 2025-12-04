import java.util.*;
public class Qmap2 {
    public static void main(String[] args) {
        String str="swiss";
        Map<Character,Integer>map= new HashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
