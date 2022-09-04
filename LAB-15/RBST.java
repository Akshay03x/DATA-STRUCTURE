import java.util.Stack;
public class RBST {
    static Node root;
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public void insert(Node temp, int a) {
        if (temp == null) {
            root = new Node(a);
            return;
        }
        if (a >= temp.data) {
            if (temp.right != null) {
                insert(temp.right, a);
                return;
            }
            temp.right = new Node(a);
            return;
        }
        if (temp.left != null) {
            insert(temp.left, a);
            return;
        }
        temp.left = new Node(a);
    }

    public void insert(int a) {
        insert(root, a);
    }

    public void inorder() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        Node temp = root;
        Stack<Node> stack = new Stack<>();
        while (temp != null || stack.size() != 0) {
            while (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }
            temp = stack.pop();
            System.out.print("[" + temp.data + "] ");
            temp = temp.right;
        }
        System.out.println();
    }

    public void PreOrder(RBST.Node root2){
        if(root2==null){
            return;
        }
        System.out.print("["+root2.data+"]");
        PreOrder(root2.left);
        PreOrder(root2.right);
    }
    public void PostOrder(RBST.Node root2){
        if(root2==null){
            return;
        }
        PostOrder(root2.left);
        PostOrder(root2.right);
        System.out.print("["+root2.data+"]");
    }
    public void inOrder2(RBST.Node root2){
        if(root2==null){
            return;
        }
        inOrder2(root2.left);
        System.out.println(root2.data);
        inOrder2(root2.right);

    }
    public static void main(String[] args) {
        RBST tree = new RBST();
        tree.insert(8);
        tree.insert(10);
        tree.insert(11);
        tree.insert(6);
        tree.insert(5);
        tree.insert(3);

        System.out.print("Inorder : ");
        tree.inorder();
        // tree.inOrder2(root);
        tree.PostOrder(root);
    }
}