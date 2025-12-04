import java.util.Scanner;
import java.util.Stack;

public class stack4 {
    public static void pushAtBottom(Stack<Integer> st,int x){
    if(st.size()==0){
        st.push(x);
        return;
    }
      int top=st.pop();
      pushAtBottom(st, x);
      st.push(top);
    }
    public static void rev(Stack<Integer> st){
        if(st.size()==1)return;
        int top=st.pop();
        rev(st);
        pushAtBottom(st,top);
    }
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
        rev(st);
        System.out.println(st);
    }
    
}
