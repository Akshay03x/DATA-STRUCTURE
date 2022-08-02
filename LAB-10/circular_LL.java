public class circular_LL{
	static Node head;
	static Node tail;
	public class Node{
		int data;
		Node next;
		public Node(int data){
			this.data=data;
			next=null;
		}
	}

	public void insert(int x){
		Node node=new Node(x);
		if(head==null){
			tail=head=node;
			return;
		}
		tail.next=node;
		tail=node;
		tail.next=head;
	}
	public void insertAtFirst(int x){
		Node newNode=new Node(x);
		if(head==null){
			tail=head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
		tail.next=newNode;
	}

	public void display(){
		Node node=head;
		if(head==tail){
			System.out.println("["+head.data+"]");
			return;
		}
		do{
			System.out.print("["+node.data+"]");
			node=node.next;
		}while(node!=head);
		System.out.print(tail.next.data);
		// System.out.print(tail.next.data);
	}
	public static void nodeRemove(int i){
		Node node=head;
		Node prev=null;
		if(i==0){
			System.out.print("index not found");
			return;
		}
		else if(i==1){
			head=node.next;
			tail.next=head;
			return;
		}
		while(i!=1){
			if(node.next==head){
				System.out.print("index not exist");
				return;
			}
			prev=node;
			node=node.next;
			i--;
		}
		prev.next=node.next;
		// System.out.print(node.next.data);
	}


	public static void main(String[] args) {
		circular_LL c=new circular_LL();
		c.insert(1);
		c.insert(2);
		c.insert(3);
		c.insert(4);
		c.insert(5);
		// c.display();
		// c.insertAtFirst(0);
		// c.insertAtFirst(1);
		// c.insertAtFirst(2);
		// c.insertAtFirst(3);
		// c.insertAtFirst(4);
		// c.insertAtFirst(5);
		System.out.println();
		nodeRemove(1);
		c.display();
	}
}