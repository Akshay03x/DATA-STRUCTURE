public class copy_LL {
    Node head;
    Node head2;
    Node tail2;
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

    public void copy(){
        Node node=head;
        while(node!=null){
            Node node2=new Node(node.data);
            if(head2==null){
                head2=node2;
                tail2=node2;
            }
            else{
                tail2.next=node2;
                tail2=node2;
            }
            node=node.next;
        }
    }

    public void display(){
        Node node=head;
        Node node2=head2;
        while(node!=null){
            System.out.print("["+node.data+"]");
            node=node.next;
        }

        System.out.println();
        System.out.println("---------");

        while(node2!=null){
            System.out.print("["+node2.data+"]");
            node2=node2.next;
        }
        System.out.println(tail2.data);
    }

    public static void main(String[] args) {
        copy_LL i=new copy_LL();

        i.insert(1);
        i.insert(2);
        i.insert(5);
        i.insert(4);
        i.copy();
        i.display();
    }
}
