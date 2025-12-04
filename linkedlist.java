public class linkedlist {
    public static void display1(Node head){
if(head==null)return;
System.out.print(head.data+" ");
display1(head.next);
    }
    public static void insertatend(Node head,int val){
           Node temp=head;
           Node t=head;
           while(t.next!=null){
            t=t.next;
           }
           t.next=temp;
    }

    
    public static void display(Node head){
        Node temp=head;
        
        while(temp!=null){
             System.out.print(temp.data+" ");
             temp=temp.next;  
         }
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int length(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;  
        }
        return count;
    }
    public static void main(String[] args){
    Node x=new Node(5);
    Node x1=new Node(6);
    Node x2=new Node(3);
    Node x3=new Node(9);
        x.next=x1;
        x1.next=x2;
        x2.next=x3;
        System.out.println(length(x));
        insertatend(x,37);
        display(x);

    }

    
}
