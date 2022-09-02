public class Binary_Using_ganerics<Type>{
    Node root;

    public class Node{
        Type data;
        Node right,left;
        public Node(Type data){
            this.data=data;
            right=left=null;
        }
    }

    public void insert(Binary_Using_ganerics<Type> x){
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
}