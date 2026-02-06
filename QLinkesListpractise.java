
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QLinkesListpractise {
    static Node reverse(Node head){
        Node prev=null;
        Node curr=head;

        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    static Node findmiddle(Node head){
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    static Node hasLoop(Node head){
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return slow;
            }
        }
        return null;

    }
    static Node merge(Node head1,Node head2){
        Node dummy=new Node(-1);
        Node tail=dummy;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                tail.next=head1;
                head1=head1.next;
            }
            else{
                tail.next=head2;
                head2=head2.next;
            }
            tail=tail.next;
        }
        tail.next=(head1!=null)?head1:head2;

        return dummy.next;

    }
    Node rotate(Node head,int k){
        if(head==null||k==0)return head;
        Node curr=head;
        int len=1;
        while(curr.next!=null){
            curr=curr.next;
            len++;
        }
        curr.next=head;
        k=k%len;
        for(int i=0;i<len-k;i++){
            curr=curr.next;
        }
        head=curr.next;
        curr.next=null;
        return head;

    }
    
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        head = reverse(head);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}

