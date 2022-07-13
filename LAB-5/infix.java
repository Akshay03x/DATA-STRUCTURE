import java.util.Stack;
import java.util.Scanner;
class infix
{   
    static String postfix="";
    static int rank=0;

        public static int F(char next){
            if(next=='+'||next=='-'){
                return 1;
            }
            else if(next=='*'||next=='/'){
                return 3;
            }
            else if(next=='^'){
                return 6;
            }
            else if (next=='('){
                return 9;
            }
            else if(next==')'){
                return 0;
            }
            else {
                return 7;
            }
        }

        public static int G(char next){
            if(next=='+'||next=='-'){
                return 2;
            }
            else if(next=='*'||next=='/'){
                return 4;
            }
            else if(next=='^'){
                return 5;
            }
            else if (next=='('){
                return 0;
            }
            else {
                return 8;
            }
        }

        public static int R(char next){
            if(next=='+'||next=='-'){
                return -1;
            }
            else if(next=='*'||next=='/'){
                return -1;
            }
            else if(next=='^'){
                return -1;
            }
            else if(next=='('|| next==')'){
                return 0;
            }
            else{
                return 1;
            }
        }


    public static void main (String[] args)
    {
        Stack<Character> stack = new Stack<Character>();
        stack.push('(');
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        char next;
        for(int i=0;i<st.length();i++){
            next=st.charAt(i);
            while(F(next)<G(stack.peek())){
                char temp=stack.pop();
                postfix+=temp;
                }
                if (F(next)!=G(stack.peek())){
                    stack.push(next);
                }
                else{
                    stack.pop();
                }
        }
        String temp2="";
        while(!stack.isEmpty()){
            temp2+=stack.pop();
        }    
        postfix+=temp2;
        System.out.print(postfix);
        for(int i=0;i<postfix.length();i++){
            rank+=R(postfix.charAt(i));
        }
        if(rank==1){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
        sc.close();
        
    }
}
