public class sorted_LL {
    Node head;
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }

    public  void insert(int x){
        Node nnode=new Node(x);
        if(head==null){
            head=nnode;
        }
        else{
            Node lastNode=head;
            while(lastNode.next!=null){
                lastNode=lastNode.next;
            }
            lastNode.next=nnode;
        }
    }

    public void sort(){
        Node iNode=head;
        Node oNode=head;

        while(oNode!=null){
            while(iNode!=null){
                Node temp=iNode.next;
                if(temp==null){
                    
                }
                else if(iNode.data>temp.data){
                    int vtemp=temp.data;
                    temp.data=iNode.data;
                    iNode.data=vtemp;
                }
                iNode=iNode.next;
            }
            iNode=head;
            oNode=oNode.next;
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
        sorted_LL s1=new sorted_LL();
        s1.insert(10);
        s1.insert(3);
        s1.insert(4);
        s1.insert(20);
        s1.insert(50);
        s1.insert(60);
        s1.sort();
        s1.display();
    }
}
