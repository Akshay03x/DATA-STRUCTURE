// . Write a program to swap two numbers using user-defines method.
import java.util.Scanner;
class number{
	public void swap(){
		Scanner sc=new Scanner(System.in);

		System.out.println("enter first number");
		int a=sc.nextInt();

		System.out.println("enter second number");
		int b=sc.nextInt();

		System.out.println("before swaping a="+a+", b="+b);

		int temp=a;
		a=b;
		b=temp;

		System.out.println("after swaping a="+a+", b="+b);
	}
}

public class swapNumber{
	public static void main(String[] args) {

		number n=new number();
		n.swap();
		
	}
}