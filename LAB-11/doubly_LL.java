public class doubly_LL{
	Node head,tail;
	public class Node{
		int data;
		Node prev;
		Node next;
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
	}

	public void insertSpecific(int position,int x){
		Node nnode=new Node(x);
		Node node=null;
		for(int i=0;i<position;i++){
			if(i==0){
				node=head;			}
			else{
				node=node.next;
			}
		}
		nnode.next=node.next;
		nnode.prev=node;
		node.next.prev=nnode;
		node.next=nnode;
	}

	public void displayFTOL(){
		Node node=head;
		while(node!=null){
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
		doubly_LL d=new doubly_LL();
		d.insertLast(10);
		d.insertLast(20);
		d.insertLast(30);
		d.insertLast(40);

		d.insertFirst(0);
		d.displayFTOL();
		System.out.println();
		// d.displayLTOF();
		d.insertSpecific(2,66);
		d.displayFTOL();
		// System.out.println("size is: "+d.size());
	}
}