public class insertInSort_LL {
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
        Node node = new Node(x);
        if (head == null) {
            head = node;
            return;
        }
        Node currentNode = head, prev = null;
        while (currentNode != null) {
            if (currentNode.data < node.data) {
                prev = currentNode;
                currentNode = currentNode.next;
            } else {
                break;
            }
        }
        prev.next = node;
        node.next = currentNode;
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
        // System.out.println(head.data);
    }
    public static void main(String[] args) {
        insertInSort_LL s1=new insertInSort_LL();
        s1.insert(10);
        s1.insert(20);
        s1.insert(70);
        s1.insert(60);
        s1.sort();
        s1.insert(30);
        s1.display();
    }
}
