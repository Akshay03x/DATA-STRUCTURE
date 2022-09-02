import java.util.Stack;
public class BinarySerchTree<Type extends Comparable<Type>>{
	Node root;
	public class Node{
		Type data;
		Node right,left;	
		public Node(Type data){
			this.data=data;
			right=left=null;
		}
	}

	public void insert(Type x){
		Node node=new Node(x);
		if(root==null){
			root=node;
			return;
		}
		Node temp=root;

		while(temp.left!=null||temp.right!=null){
			if((node.data).compareTo(temp.data)>0 && temp.right!=null){
				temp=temp.right;
			}
			else if((node.data).compareTo(temp.data)<0&& temp.left!=null){
				temp=temp.left;
			}

			else{
				break;
			}
		}
		if((node.data).compareTo(temp.data)>0){
			temp.right=node;
		}
		else{
			temp.left=node;
		}
	}

	public void display(){
		if(root==null){
			System.out.print("null");
			return;
		}
		Node temp=root;
		Stack<Node> st=new Stack<Node>();

		while(temp!=null||st.size()>0){
			while(temp!=null){
				st.push(temp);
				temp=temp.left; 
			}
			temp=st.pop();
			System.out.print("["+temp.data+"]");
			temp=temp.right;
		}
		System.out.println();
	}


	public void preorder() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            System.out.print("[" + temp.data + "] ");
            if (temp.right != null)
                stack.push(temp.right);
            if (temp.left != null)
                stack.push(temp.left);
        }
        System.out.println();
    }

    public void postorder() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);

        while (!stack1.empty()) {
            Node temp = stack1.pop();
            stack2.push(temp);
            if (temp.left != null)
                stack1.push(temp.left);
            if (temp.right != null)
                stack1.push(temp.right);
        }

        while (!stack2.empty()) {
            Node temp = stack2.pop();
            System.out.print("[" + temp.data + "] ");
        }
        System.out.println();
    }

	public static void main(String[] args) {
		BinarySerchTree<Integer> b=new BinarySerchTree<>();

		b.insert(50);
		b.insert(25);
		b.insert(75);
		b.insert(22);
		b.insert(40);
		b.insert(60);
		b.insert(80);
		b.insert(90);
		b.insert(15);
		b.insert(30);

		System.out.print("inorder");
		b.display();
		System.out.print("post order");
		b.postorder();
		System.out.print("preorder");
		b.preorder();
	}
}
