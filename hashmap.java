import  java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();

        map.put("India",120);
        map.put("Us",30);
        map.put("China",180);
        System.out.println(map);

        if(map.containsKey("China")){
            System.out.println("present");
            
        }else{
            System.out.println("not");
        }
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonasia"));
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        Set<String> keys=map.keySet();
        for(String key: keys){
            System.out.println(key+" "+map.get(key));
        }
        map.remove("China");
        System.out.println(map);
    }
}
