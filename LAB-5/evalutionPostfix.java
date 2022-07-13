import java.util.*;
public class evalutionPostfix {
    static Stack<Integer> stack = new Stack<Integer>();

    public static void stackPush(int x){
        if(x==48){
            stack.push(0);
        }
        else if(x==49){
            stack.push(1);
        }
        else if(x==50){
            stack.push(2);
        }
        else if(x==51){
            stack.push(3);
        }
        else if(x==52){
            stack.push(4);
        }
        else if(x==53){
            stack.push(5);
        }
        else if(x==54){
            stack.push(6);
        }
        else if(x==55){
            stack.push(7);
        }
        else if(x==56){
            stack.push(8);
        }
        else{
            stack.push(9);
        }
    }

    public static void operate(int x){
        if(x==45){
            int operand2=stack.pop();
            int operand1=stack.pop();
            int Rvalue=operand1 - operand2;
            stack.push(Rvalue);
        }
        else if(x==43){
            int operand2=stack.pop();
            int operand1=stack.pop();
            int Rvalue=operand1 + operand2;
            stack.push(Rvalue);
        }
        else if(x==42){
            int operand2=stack.pop();
            int operand1=stack.pop();
            int Rvalue=operand1 * operand2;
            stack.push(Rvalue);
        }
        else{
            int operand2=stack.pop();
            int operand1=stack.pop();
            int Rvalue=operand1 /operand2;
            stack.push(Rvalue);
        }
        
    }

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String st=sc.next();
    // stack.push(0);
    for(int i=0;i<st.length();i++){
        int x=st.charAt(i);
        if(x==45 ||x==42||x==43||x==47){
            operate(x);
        }
        else{
            stackPush(x);
        }
    }
    System.out.println(stack.pop());
    }
}
