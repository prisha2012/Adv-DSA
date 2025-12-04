import java.util.*;
public class QDeque {
    public static void main(String[] args) {
        
        Deque<Integer> stack=new ArrayDeque<>();
        
        
        stack.addFirst(20);
        stack.addFirst(30);
        stack.addFirst(40);
        while(!stack.isEmpty()){
            System.out.println(stack.removeFirst());
        }
       
    }

}
