public class Queue{
    private int data[];
    private int front;
    private int rear;

    public Queue(){
        data=new int[10];
        rear=-1;
    }
    public Queue(int capacity){
        data=new int[capacity];
        rear=-1;
    }

    public void enqueue(int n){
        if(rear>data.length){
            System.out.println("queue overflow");
        }
        rear++;
        data[rear]=n;
        front=0;
    }

    public int dequeue(){
        if(front==-1|| front>=data.length||front>rear){
            System.out.println("queue overflow");
        }
        int temp=data[front];
        front++;
        return temp;
    }
}