import java.util.Stack;
public class BinarySerchTree{
	Node root;
	public class Node{
		int data;
		Node right,left;
		public Node(int data){
			this.data=data;
			right=left=null;
		}
	}

	public void insert(int x){
		Node node=new Node(x);
		if(root==null){
			root=node;
			return;
		}
		Node temp=root;

		while(temp.left!=null||temp.right!=null){
			if(node.data>temp.data && temp.right!=null){
				temp=temp.right;
			}
			else if(node.data<temp.data && temp.left!=null){
				temp=temp.left;
			}

			else{
				break;
			}
		}
		if(node.data>temp.data){
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
	}

	public static void main(String[] args) {
		BinarySerchTree b=new BinarySerchTree();

		b.insert(10);
		b.insert(0);
		b.insert(5);
		b.insert(30);
		b.insert(40);
		b.display();
	}
}