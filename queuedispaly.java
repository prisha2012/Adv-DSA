import java.util.LinkedList;
import java.util.Queue;

public class queuedispaly {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        Queue<Integer> q1= new LinkedList<>();
        while(q.size()>0){
            System.out.println(q.peek());
            q1.add(q.poll());
        }
        while(q1.size()>0){
            q.add(q1.poll());
        }
    }
}
