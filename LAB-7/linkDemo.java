public class linkDemo {
    Node head;
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }


    public void insert(int x){
        Node nnode=new Node(x);
        if(head==null){
            head=nnode;
        }
        else{
            Node lastnode=head;
            while(lastnode.next!=null){
                lastnode=lastnode.next;
            }
            lastnode.next=nnode;
        }
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
    }
    public static void main(String[] args) {
        linkDemo list=new linkDemo();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
    }
}
