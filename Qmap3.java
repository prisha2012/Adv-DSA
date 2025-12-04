import java.util.*;
public class Qmap3 {
    public static void main(String[] args) {
        
        Map<String,Integer>map=new HashMap<>();
        map.put("Aman",85);
        map.put("Prisha",90);
        map.put("Riya",90);

        String topper="";
        int max=-1;
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                topper=entry.getKey();

            }
        }
        System.out.println("Topper is "+topper+" with marks "+max);
    }


}
