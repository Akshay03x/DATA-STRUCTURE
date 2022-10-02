public class circular_doubly_LL{
	Node head,tail;
	public class Node{
		int data;
		Node prev, next;
		public Node(int data){
			this.data=data;	
			prev=null;
			next=null;
		}
	}

	public void insertLast(int x){
		Node nnode=new Node(x);
		if(head==null){
			head=nnode;
			tail=nnode;
			return;
		}
		tail.next=nnode;
		nnode.prev=tail;
		tail=nnode;
		tail.next=head;
		head.prev=tail;
	}

	public void insertFirst(int x){
		Node nnode=new Node(x);
		if(head==null){
			head=nnode;
			tail=nnode;
			return;
		}
		nnode.next=head;
		head.prev=nnode;
		head=nnode;
		head.prev=tail;
		tail.next=head;
	}


	public void displayFTOL(){
		Node node=head;
		System.out.println(node.data);
		node=node.next;
		while(node!=head){
			System.out.print("["+node.data+"]");
			node=node.next;
		}
	}
	public void displayLTOF(){
		Node node=tail;
		while(node!=null){
			System.out.print("["+node.data+"]");
			node=node.prev;
		}
	}

	public int  size(){
		int count=0;
		Node node=head;
		while(node!=null){
			count++;
			node=node.next;
		}
		return count;
	}

	public static void main(String[] args) {
		circular_doubly_LL d=new circular_doubly_LL();
		d.insertLast(10);
		d.insertLast(20);
		d.insertLast(30);
		d.insertLast(40);
		d.insertFirst(0);
		d.displayFTOL();
		System.out.println();
	}
}
