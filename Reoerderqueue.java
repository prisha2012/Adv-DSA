import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Reoerderqueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            q.add(k);
        }
        Stack<Integer> st=new Stack<>();
        for(int i=1;i<=n/2;i++){
            st.push(q.remove());

        }
        while(st.size()>0){
            q.add(st.pop());

        }
        for(int i=1;i<=n/2;i++){
            st.push(q.remove());

        }
      while(st.size()>0){
        q.add(st.pop());
        q.add(q.remove());
       }
       while(q.size()>0){
        st.push(q.remove());
       }
       while(st.size()>0){
        q.add(st.pop());
       }
       System.out.println(q);
    }
}
