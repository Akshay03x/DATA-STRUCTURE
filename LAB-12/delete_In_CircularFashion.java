public class delete_In_CircularFashion {
    Node head,tail;

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
            tail.next=head;
            return;
        }
        tail.next=node;
        tail=node;
        tail.next=head;
    }

    public void delete_In_Circular(int z){
        Node node=head;
        Node prev=head;
        display();
        System.out.println();
        while(node!=node.next){
            for(int i=z;i>1;i--){
                prev=node;
                node=node.next;
            }
            if(node==head|| node==tail){
                if(node==head){
                    head=node.next;
                    prev.next=head;
                }
                else{
                    tail=prev;
                    prev.next=head;
                }
            }
            prev.next=node.next;
            node=prev.next;
            if(node==tail || node==head){
                display();
                System.out.println();
            }
        }
    }
    public void display(){
        Node node=head;
        System.out.print("["+node.data+"]");
        node=node.next;
        while(node!=head){
            System.out.print("["+node.data+"]");
            node=node.next;
        }
    }

    public static void main(String[] args) {
        delete_In_CircularFashion d=new delete_In_CircularFashion();
        d.insert(10);
        d.insert(20);
        d.insert(30);
        d.insert(40);
        d.insert(50);
        d.delete_In_Circular(4);
    }

}
