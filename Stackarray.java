public class Stackarray {
    public static class stack{
        int[] arr=new int[5];
        int idx=0;
        void push(int x){
            arr[idx]=x;
            idx++;
        }
        int peek(int x){
            if(idx==0) {
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0) {
                System.out.println("stack is empty");
                return -1;
            }  
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;

        }
        void display(){
            for(int i=0;i<idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        stack st=new stack();
        st.push(4);
        st.push(5);
       
        st.display();
        st.pop();
        st.display();
        
    }
}
