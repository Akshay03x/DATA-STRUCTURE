package stack_Array;
public class stackUsingArray {

    private int data[];
    private int top;

    public stackUsingArray(){
        data=new int[10];
        top=-1;
    }
    public stackUsingArray(int capacity){
        data=new int[capacity];
        top=-1;
    }
    public  boolean isEmpty(){
        return (top==-1);
    }
    public int size(){
        return top+1;
    }
    public int top(){
        if(size()==0){
            System.out.println("noting");
        }
        return data[top];
    }
    public void push(int elem){
        top++;
        data[top]=elem;
    }

    public int pop(){
        int temp=data[top];
        top--;
        return temp;
    }
}
