import java.util.Scanner;
import java.util.Stack;

public class stacks3 {
    public static void displayrec(Stack<Integer> s){
       if(s.size()==0)return;
       int top=s.pop();
       displayrec(s);
       System.out.print(top+" ");
        s.push(top);

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
        displayrec(st);
        // Stack<Integer> rt=new Stack<>();
        // while(st.size()>0){
        //     rt.push(st.pop());
        // }
        // while(rt.size()>0){
        //    int x=rt.pop();
        //    System.out.print(x+" ");
        //    st.push(x);
        // }

        // int m=st.size();
        // int[] arr=new int [m];
        // for(int i=m-1;i>=0;i--){
       
        //   arr[i]=st.pop();
        // }
        // for(int i=0;i<m;i++){
        //     System.out.print(arr[i]+" ");
        //     st.push(arr[i]);
        // }
    }
    
}
