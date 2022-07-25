public class satckUsing_LL {
        Node head;
        Node tail;
        static int top=0;
        public class Node{
            int data;
            Node next;
            public Node(int data){
                this.data=data;
                next=null;
            }
        }

        public void push(int x){
            top++;
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
                tail=nnode;
            }
        }

        public void pop(){
            top--;
            Node node=head;
            Node prev=head;
            if(head==null){
                    System.out.println("under flow");
                    return;
                }
            while(node.next!=null){
                prev=node;
                node=node.next;
                }
                if(head.next==null){
                    head=null;
                }
                System.out.println("pop element is:"+node.data);
                prev.next=null;
        }

        public int peek(){
            return tail.data;
        }

        public int peep(int i){
            int top1=top;
            int element=top1-i+1;
            Node node=null;
            if(element<=0){
                System.out.println("stack under flow");
                return -1;
            }
            while(element!=0){
                element--;
                if(node==null){
                    node=head;
                }
                else{
                    node=node.next;
                }
            }
            return node.data;
        }


        public void change(int i,int x){
            int top1=top;
            int element=top1-i+1;
            Node node=null;
            if(element<=0){
                System.out.println("stack under flow");
                return;
            }
            while(element!=0){
                element--;
                if(node==null){
                    node=head;
                }
                else{
                    node=node.next;
                }
            }
            node.data=x;
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
            System.out.println();
        }
        public static void main(String[] args) {
            satckUsing_LL list=new satckUsing_LL();
            list.push(10);
            list.push(20);
            list.push(30);
            list.push(40);

            // list.peep(3);
            // list.pop();
            // list.pop();
            // list.pop();
            // list.pop();
            list.change(3, 99);
            list.display();
            System.out.println("peek elemnt is :"+list.peek());
            // System.out.println(top);
            System.out.println("peep element is:"+list.peep(4));
            // System.out.println(tail.data);
        }
    }


