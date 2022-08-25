public class queue_Using_Dou_LL {
    Node head,tail;

    public class Node{
        int data;
        Node prev,next;
        public Node(int data){
            this.data=data;
            prev=next=null;
        }
    }

    public void enQueue(int x){
        Node node=new Node(x);
        if(head==null){
            head=tail=node;
            return;
        }
        node.prev=tail;
        tail.next=node;
        tail=node;
    }

    public void enQueue_last(int x){
        Node node=new Node(x);
        if(head==null){
            head=tail=node;
            return;
        }
        head.prev=node;
        node.next=head;
        head=node;
    }

    public int dequeue(){
        int temp=head.data;
        head=head.next;
        head.prev=null;
        return temp;
    }

    public int dequeue_last(){
        int temp=tail.data;
        tail=tail.prev;
        tail.next=null;
        return temp;
    }

    public void display(){
        Node node=head;
        while(node!=null){
            System.out.print("["+node.data+"]");
            node=node.next;
        }
    }
    public static void main(String[] args) {
        queue_Using_Dou_LL q=new queue_Using_Dou_LL();
        q.enQueue_last(00);
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue_last());
        System.out.println(q.dequeue());
        q.display();
    }
}
