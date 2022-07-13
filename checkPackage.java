import stack_Array.*;
public class checkPackage {
    public static void main(String[] args) {
        stackUsingArray stack=new stackUsingArray();
        for(int i=0;i<=5;i++){
            stack.push(i);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
