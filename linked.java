public class linked {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertatend(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
             
            }
            else{
            tail.next=temp;
            size++;
        }
        tail=temp;
        }
        void display(){
            Node temp=head;
        
            while(temp!=null){
                 System.out.print(temp.data+" ");
                 temp=temp.next;  
             }
        }
        // int size(){
        //     Node temp=head;
        //     int count=0;
        //     while(temp!=null){
        //         count++;
        //         temp=temp.next;
        //     }
        //     return count;  
        // }
    
    void insetathead(int vall){
        Node temp=new Node(vall);
        if(head==null){
            head=tail=temp;


        }
        else{
            temp.next=head;
            head=temp;
        }
            size++;
    }
    void insertat(int idx,int val){
    Node t=new Node(val);
    Node temp=head;
    for(int i=1;i<idx-1;i++){
        temp=temp.next;
    }
    t.next=temp.next;
    temp.next=t;
    size++;
    }
    void deleteat(int idx){
        if(idx==0)head=head.next;
        Node temp=head;
        for(int i=1;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        tail=temp;
        size--;
    }
    }
    public static void main(String[] args){
linkedlist ll=new linkedlist();
ll.insertatend(4);
ll.insertatend(5);
ll.display();
System.out.println();
ll.insetathead(13);
ll.display();
ll.insertat(2,10);
System.out.println();
ll.display();
ll.deleteat(0);

System.out.println();
ll.display();
System.out.println();
System.out.println(ll.tail.data);
System.out.println(ll.size);

    }
}
