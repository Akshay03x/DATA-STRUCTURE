public class queueUsing_LL{
    Node head;
    Node tail;
    static int  rear=0;
    static int front=0;
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }

    public void enqueue(int x){
        Node nnode=new Node(x);
        if(head==null){
            head=nnode;
            front=1;
            rear=1;
        }
        else{
            Node lastnode=head;
            while(lastnode.next!=null){
                lastnode=lastnode.next;
            }
            lastnode.next=nnode;
            tail=nnode;
            rear++;
        }
    }

    public int dequeue(){
        Node node=head;
        if(head.next==null){
            int temp=head.data;
            head=null;
            return temp;
        }
        else if(head==null){
            System.out.println("empty queue");
        }
        else{
            front++;
            int temp=head.data;
            head=head.next;
            return temp;
        }
        return -1;  
    }

    public void display(){
        Node node=head;
        if(head==null || front>rear){
            System.out.println("empty");
            rear=0;
            front=0;
        }
        else{
            System.out.println("element in queue is:");
            while(node!=null){
                System.out.print("["+node.data+"]");
                node=node.next;
            }
        }
        System.out.println();
        System.out.println("rear is:"+rear);
        System.out.println("front is:"+front);
        System.out.println();
    }
    public static void main(String[] args)  throws NullPointerException{
        queueUsing_LL q1=new queueUsing_LL();
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);

        System.out.println("dequeue element is:"+q1.dequeue());
        System.out.println("dequeue element is:"+q1.dequeue());
        System.out.println("dequeue element is:"+q1.dequeue());
        System.out.println("dequeue element is:"+q1.dequeue());
        q1.display();
    }
}