public class Stack_Using_Dou_LL {
    Node head,tail;

    public class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
            prev=null;
            next=null;
        }
    }
    
    public void push(int x){
        Node node=new Node(x);
        if(head==null){
            tail=head=node;
            return;
        }
        node.prev=tail;
        tail.next=node;
        tail=node;
    }

    public void pop(){
        tail.prev.next=null;
        tail=tail.prev;
    }

    public int peep(int x){
        Node node=tail;
        for(int i=x;i>1;i--){
            if(node.prev==null){
                System.out.println("underflow");
                return 0;
            }
            node=node.prev;
        }
        return node.data;
    }

    public void change(int x,int data){
        Node node=tail;
        for(int i=x;i>1;i--){
            if(node.prev==null){
                System.out.println("underflow");
                return;
            }
            node=node.prev;
        }
        node.data=data;
    }

    public void display(){
        Node node=head;
        while(node!=null){
            System.out.print("["+node.data+"]");
            node=node.next;
        }
    }
    public static void main(String[] args) {
        Stack_Using_Dou_LL d=new Stack_Using_Dou_LL();
        d.push(10);
        d.push(20);
        d.push(30);
        d.push(40);
        // d.pop(); 
        // System.out.println(d.peep(4));
        // d.change(4, 200);
        d.display();
    }
}
