import java.util.*;
public class Q5marker {
    static String findLastName(String[] names) {
        Map<Integer, Integer> nameMap = new HashMap<>();
        for (String name:names){
            int n=name.length();
            nameMap.put(n,nameMap.getOrDefault(n,0)+1);
        }
        int maxLength =0;
        for(int length:nameMap.keySet()){
            if(length>maxLength){
                maxLength=length;
            }
        }
        Set <Integer> longestNames = new HashSet<>();
        for(Map.Entry<Integer,Integer> entry:nameMap.entrySet()){
            if(entry.getKey()==maxLength){
                longestNames.add(entry.getKey());
            }
        }
        for(int i=names.length-1;i>=0;i--){
            if(longestNames.contains(names[i].length())){
                return names[i];
            }
        }
        return "";
    }
     public static void main(String[] args) {
        String[] names1 = {"Rohan", "Akash", "Mansi", "Neeta"};
        System.out.println(findLastName(names1)); // Expected: Neeta

        String[] names2 = {"Alice", "Bob", "Tom", "Jerry"};
        System.out.println(findLastName(names2)); // Expected: Jerry

        String[] names3 = {"Arjun", "Riya", "Divya", "Rahul"};
        System.out.println(findLastName(names3)); // Expected: Rahul
    }
}

