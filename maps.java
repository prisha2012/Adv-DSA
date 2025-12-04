import java.util.*;
public class maps {
    public static void main(String[] args) {
        Map<String,Integer> marks =new HashMap<>();
        marks.put("Alice",90);
        marks.put("Bob",85);
        System.out.println(marks.get("Bob"));
        System.out.println(marks);
    }
}
