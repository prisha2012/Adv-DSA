import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class reversekthqueue {


    public static void main(String[] args) {
    Queue<Integer> q=new LinkedList<>();
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       Scanner sc=new Scanner(System.in);
       int k=sc.nextInt();
   
       
         if (k > q.size() || k < 0) {
            System.out.println("Invalid value of k");
            return;
        }
 Stack<Integer> st= new Stack<>();
       for (int i = 0; i < k; i++){
        st.push(q.remove());
       }
       while(st.size()!=0){
        q.add(st.pop());

       }
       int n=q.size();
         for (int i = 0; i < n - k; i++){
        q.add(q.remove());

       }
       System.out.println(q);
    }
}