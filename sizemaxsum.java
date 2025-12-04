
public class sizemaxsum {

public static class Node{
    int val;
    Node left;
    Node right;3
    public Node(int val) {
        this.val=val;
    }  
}
public static void preorder(Node root){
    if(root==null)return;
   System.out.println(root.val);
    preorder(root.left);
    preorder( root.right);
}

// }
// public static int size (Node root){
// if(root==null) return 0;
// return 1+size(root.left)+size(root.right);


// }
// public static int height(Node root){
//     if(root==null)return 0;
//     if(root.left==null && root.right==null);
//     return 1+Math.max(height(root.left),height(root.right));
// }
// public static int max(Node  root){
//     if(root==null)return Integer.MIN_VALUE;
//     int a=root.val;
//     int b=max(root.left);
//     int c=max(root.right);
//     return Math.max(a,Math.max(b,c));

// }
// public static void inorder(Node root){
//      if(root==null)return ;
//      inorder(root.left);
//     System.out.println(root.val);
//     inorder(root.right);

// }
// public static int size (Node root){
// if(root==null) return 0;
// return 1+size(root.left)+size(root.right);
// }
public static void nthlevel(Node root,int n){
    if(root==null)return;
    if(n==1) System.out.print(root.val+" ");
  
  nthlevel(root.left,n-1);
     nthlevel( root.right,n-1);
}
 public static void main(String[] args) {
        Node root=new Node(1);
         Node a=new Node(2);
          Node b=new Node(3);
          root.left=a;
          root.right=b;
           Node c=new Node(4);
            Node d=new Node(5);
             a.left=c;
          a.right=d;
             Node e=new Node(6);

          b.right=e;
          nthlevel(root,3);
    }
}


