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
			if(node.data>=temp.data && temp.right!=null){
				temp=temp.right;
			}
			else if(node.data<temp.data && temp.left!=null){
				temp=temp.left;
			}

			else{
				break;
			}
		}
		if(node.data>=temp.data){
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
			System.out.print("["+temp.data+"] ");
			temp=temp.right;
		}
		System.out.println();
	}
	public void preOrder(){
		if(root==null){
			System.out.print("empty");
			return;
		}
		Stack<Node> st=new Stack<>();	
		st.push(root);
		while(st.size()!=0){
			Node temp=st.pop();
			System.out.print("["+temp.data+"] ");
			if(temp.right!=null){
				st.push(temp.right);
			}
			if(temp.left!=null){
				st.push(temp.left);
			}
		}
		System.out.println();
	}

	public void postOrder(){
		if(root==null){
			System.out.println("empty");
			return;
		}
		Stack<Node> s1=new Stack<>();
		Stack<Node> s2=new Stack<>();
		s1.push(root);
		while(s1.size()>0){
			Node temp=s1.pop();
			s2.push(temp);

			if(temp.left!=null){
				s1.push(temp.left);
			}
			if(temp.right!=null){
				s1.push(temp.right);
			}
		}

		while(s2.size()!=0){
			Node temp=s2.pop();
			System.out.print("["+temp.data+"] ");
		}
		System.out.println();
		
	}


	public void delete(int x){
		Node parent=null;
		Node temp=root;
		while(temp!=null&& temp.data!=x){
			parent=temp;
			if(temp.data<x){
				temp=temp.right;
			}
			else{
				temp=temp.left;
			}
		}
		if(temp.left==null&&temp.right==null){
			if(parent.data>temp.data){
				parent.left=null;
			}
			else{
				parent.right=null;
			}
		}
		if(temp.left==null || temp.right!=null){
			temp=temp.right;
			if(temp.data>=parent.data){
				parent.right=temp;
			}
			else{
				parent.left=temp;
			}
		}
		if(temp.left!=null || temp.right==null){
			temp=temp.left;
			if(temp.data<=parent.data){
				parent.left=temp;
			}
			else{
				parent.right=temp;
			}
		}
	}
	public static void main(String[] args) {
		BinarySerchTree b=new BinarySerchTree();

		b.insert(5);
		b.insert(3);
		b.insert(2);
		b.insert(4);
		b.insert(8);
		b.insert(10);
		b.insert(9);
		// b.delete(10);
		System.out.print("pre order:");
		b.preOrder();
		System.out.print("post order :");
		b.postOrder();
		System.out.print("inOrder :");
		b.display();
	}
}    
