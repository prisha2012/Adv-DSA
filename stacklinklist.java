public class stacklinklist {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }

    }
    public static class stack{
        Node head=null;
        int size=0;
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;

            }
            int x=head.val;
            head=head.next;
            return x;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.val+" ");
            }
            System.out.println();
        }
        int size(){
            return size;
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
