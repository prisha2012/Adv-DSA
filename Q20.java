import java.util.*;
public class Q20 {
    public static void main(String[] args) {
        Map<String, Integer> map=new TreeMap<>();
        map.put("rohan",90);
        map.put("aman",40);
        map.put("prisha",95);
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>50){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
            
    }


}
}
