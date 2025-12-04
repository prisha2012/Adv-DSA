import java.util.*;

public class Arraylist1 {
    public static<T> void displayList(List<T> list){
        for(T item:list){
            System.out.print(item+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
       ArrayList<String> names=new ArrayList<>(Arrays.asList("Alice","bob","Ana"));
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        displayList(names);  
        displayList(nums);
    }
}
