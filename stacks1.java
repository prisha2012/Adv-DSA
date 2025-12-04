import java.util.*;
public class stacks1 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int n;
        System.out.println("enter elements");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
           int x=sc.nextInt();
           st.push(x); 
        }
        System.out.println(st);
        // reverse order
        Stack<Integer> ab=new Stack<>();
        while(st.size()>0){
            ab.push(st.pop());
        }
        System.out.println(ab);
        Stack<Integer> ba=new Stack<>();
        while(ab.size()>0){
            ba.push(ab.pop());
        }
        System.out.println(ba);
    }
    
}
