import java.util.*;
public class evalutionPrefix {
    static Stack<Integer> stack = new Stack<Integer>();

    public static void stackPush(int x){
        stack.push(x);
    }

    public static void operate(int x){
        if(x==45){
            int operand1=stack.pop();
            int operand2=stack.pop();
            int Rvalue=operand1 - operand2;
            stack.push(Rvalue);
        }
        else if(x==43){
            int operand1=stack.pop();
            int operand2=stack.pop();
            int Rvalue=operand1 + operand2;
            stack.push(Rvalue);
        }
        else if(x==42){
            int operand1=stack.pop();
            int operand2=stack.pop();
            int Rvalue=operand1 * operand2;
            stack.push(Rvalue);
        }
        else{
            int operand1=stack.pop();
            int operand2=stack.pop();
            int Rvalue=operand1 /operand2;
            stack.push(Rvalue);
        }
        
    }

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String st=sc.next();
    // stack.push(0);
    for(int i=st.length()-1;i>=0;i--){
        int x=st.charAt(i);
        if(x==45 ||x==42||x==43||x==47){
            operate(x);
        }
        else{
             int temp=(int)x-48;
            stackPush(temp);
        }
    }
    System.out.println(stack.pop());
    }
}
