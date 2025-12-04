public class BST {
    public static class Node{
    int val;
    Node left;
    Node right;
    public Node(int val) {
        this.val=val;
    }
}
public static int height(Node root){
    if(root==null||(root.left==null&&root.right==null)) return 0;
    return 1+Math.max(height(root.left),height(root.right));
}
public static void delete(Node root,int target){
    if(root==null)return;
    if(root.val>target){
         if(root.left==null) return;
        if(root.left.val==target)
        if(root.left.left==null&&root.left.right==null)root.left=null;//0 child
        else if(root.left.left==null||root.left.right==null){
            if(root.left.left!=null) root.left=root.left.left;
            else root.right=root.left.right;
        }

        else delete(root.left,target);
    }
     else if(root.val<target){
        if(root.right==null) return;
        if(root.right.val==target)root.right=null;
        else delete(root.right,target);
    }
}
public class predSuc{
    static int pred=-1;
    static int suc= -1;
    static Node temp=null;
    static boolean flag=false;


}
private static void inorder(Node root,int val){
    if(root==null) return;
    inorder(root.left);
    if(temp==null) temp=root;
    else{
        if(root.val==val){
            pred=temp.value;

        }
        else if(root.val>val&&flag==true){
            suc=root.val;
            flag=false
        }
        else temp=root;
    }
    inorder(root.right);

}
    public static void main(String[] args) {
        String[] arr={"1","2","3","4","5","6","7","8","9"};
        Node root=BSt(arr);
    }
}
