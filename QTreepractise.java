class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class QTreepractise {
    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    static int height(Node root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(height(root.left), height(root.right));
    }
    static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(key<root.data){
            return search(root.left, key);
        }
        return search(root.right, key);
    }
    static Node insert(Node root,int key){
        if(root==null){
            return new Node(key);
        }
        if(key<root.data){
            root.left=insert(root.left, key);
        }
        else{
            root.right=insert(root.right, key);
        }
        return root;
    }
    static int floor(Node root,int key){
        int ans=-1;
        while(root!=null){
            if(root.data==key){
                return root.data;

            }
            if(root.data>key){
                root=root.left;
            }
            else{
                ans=root.data;
                root=root.right;
            }

            }
        return ans;

        }
    static int ceil(Node root,int key){
        int ans=-1;
        while(root!=null){
            if(root.data==key){
                return root.data;

            }
            if(root.data<key){
                root=root.right;
            }
            else{
                ans=root.data;
                root=root.left;
            }

            }
        return ans;

    }
    static int countLeaf(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        return countLeaf(root.left)+countLeaf(root.right);
    }
    static int nonleaf(Node root){
        if(root==null || (root.left==null && root.right==null)){
            return 0;
        }
        return 1+nonleaf(root.left)+nonleaf(root.right);
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
    }
}
