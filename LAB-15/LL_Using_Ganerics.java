public class LL_Using_Ganerics<Type> {
    Node head,tail;

    public class Node {
        Type data;
        Node next;
        public Node(Type data){
            this.data = data;
            next=null;
        }
    }

    public void insert(Type x){
        Node node=new Node(x);
        if(head==null){
            tail=head=node;
            return;
        }
        tail.next=node;
        tail=node;
    }

    public void display(){
        Node node=head;
        if(head==null){
            System.out.println("empty");
            return;
        }
        while(node!=null){
            System.out.print("["+node.data+"]");
            node=node.next;
        }
    }

    public static void main(String[] args) {
        LL_Using_Ganerics<Character> g=new LL_Using_Ganerics<>();

        g.insert('a');
        g.insert('b');
        g.insert('c');
        g.insert('d');
        g.display();
    }
}
