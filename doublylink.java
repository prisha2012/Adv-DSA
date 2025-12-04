public class doublylink {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
       static  void display(Node head){
            Node temp=head;
        
            while(temp!=null){
                 System.out.print(temp.val+" ");
                 temp=temp.next;  
             }
            
        }
        void display1(Node tail){
            Node temp=tail;
        
            while(temp!=null){
                 System.out.print(temp.val+" ");
                 temp=temp.prev;  
             }
        }
        static void  display2 (Node random){
            Node temp=random;
        
            while(temp.prev!=null){
                temp=temp.prev;  
             }
             while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;  
            }
        }
        public static Node insertAt(Node head,int x){
            Node t=new Node(30);
            t.next=head;
            head.prev=t;
            head=t;
            return head;

        }
        public static void insertAtt(Node head,int x){
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            Node t=new Node(x);
            temp.next=t;
            t.prev=temp;

        }
        public static void inserAtid(Node head,int idx,int x){
            Node temp=head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            Node r=temp.next;
            Node t=new Node(x);
            temp.next=t;
            t.prev=temp;
            t.next=r;
            r.prev=t;

        }
    public static void main(String[] args){
        Node a=new Node(4);
        Node b=new Node(5);
        Node c=new Node(6);
        Node d=new Node(7);
        Node e=new Node(8);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
     
       insertAtt(a,35 );
        display(a);
    }
}
