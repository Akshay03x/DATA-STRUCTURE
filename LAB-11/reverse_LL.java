public class reverse_LL {
    Node head;
    Node tail;

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
            head=node;
            tail=node;
            return ;
        }
        Node lastnode=head;
        while(lastnode.next!=null){
            lastnode=lastnode.next;
        }
        lastnode.next=node;
        tail=node;
    }

    public void reverse(){
        Node node=head;
        Node prev=null;
        while(node.next!=null){
            if(node==head){
                prev=head;
            }
            // else{
            //     node.next=prev;
            //     prev=node;
            // }
            node=node.next;
        }
        node.next=prev;
        head.next=null;
        head=node;
    }

    public void display(){
        if(head==null){
            System.out.println("Empty");
        }else{
            Node node=head;
            while(node!=null){
                System.out.print("["+node.data+"] ");
                node=node.next;
            }
        }
        System.out.println(tail.data);
    }

    public static void main(String[] args) {
        reverse_LL r=new reverse_LL();

        r.insert(10);
        r.insert(20);
        r.insert(30);
        r.insert(40);
        r.insert(50);
        r.reverse();
        r.display();
    }
}