import java.net.SocketImpl;

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


    public void find(int x){
        Node node=head;
        boolean flag=false;
        int i=1;
        while(node!=null){
            if(node.data==x){
                flag=true;
                break;
            }
            i++;
            node=node.next;
        }
        if(flag){
            System.out.println("found At_"+i);
        }
        else{
            System.out.println("not found");
        }
    }


    public static void main(String[] args) throws NullPointerException {
        linkList_delete list=new linkList_delete();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();

        list.find(10);
    }
}
