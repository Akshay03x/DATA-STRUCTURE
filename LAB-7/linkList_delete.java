public class linkList_delete {
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


    public void delete(int x){
        Node node=head;
        Node prev=head;
        while(node!=null){
            if(head.data==x){
                head=head.next;
                break;
            }
            else if(node.data==x){
                break;
            }
            prev=node;
            node=node.next;
        }
        prev.next=node.next;
    }


    public static void main(String[] args) throws NullPointerException {
        linkList_delete list=new linkList_delete();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        
        list.delete(10);
        list.display();
    }
}
