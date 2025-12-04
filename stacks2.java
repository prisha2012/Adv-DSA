import java.util.Scanner;
import java.util.Stack;

public class stacks2 {

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
        int idx=sc.nextInt();
        int num=sc.nextInt();
        Stack<Integer> rt=new Stack<>();
        while(st.size()>idx){
            rt.push(st.pop());
        }
        st.push(num);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
    
}
