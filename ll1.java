public class ll1 {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    // public static void nthNode2(Node head,int n){
    //     Node slow=head;
    //     Node fast=head;
    //     for(int i=0;i<n;i++){
    //         fast=fast.next;
    //     }
    //     if(fast==null){
    //         head=head.next;
    //     }
    //     while(fast.next!=null){
    //         slow=slow.next;
    //         fast=fast.next;

    //     }
    //    slow.next=slow.next.next;

    // }
    public static Node reverse(Node head){
      Node prev=null,current=head,agla=null;
      while()
      agla=current.next;
      current.next=null;
      prev=current;
      current=agla;
    }
    public static void main(String[] args) {
        Node x=new Node(5);
        Node x1=new Node(6);
        Node x2=new Node(3);
        Node x3=new Node(9);
            x.next=x1;
            x1.next=x2;
            x2.next=x3;
        nthNode2(x,2);
        display
      
    }
}
