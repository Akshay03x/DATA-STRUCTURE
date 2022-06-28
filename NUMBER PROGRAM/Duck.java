// A Duck number is a number which has zeroes present in it, but there should be no zero present in the beginning of the number
// For example 3210
import java.util.Scanner;
public class Duck{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter number");
		int a=sc.nextInt();
		boolean flag=false;
		int x;
	
		while (a>0) {
			x=a%10;
			if(x==0){
				flag=true;
			}
			a=a/10;
		}
		if(flag){
			System.out.println("Duck number");
		}
		else{
			System.out.println("not DUck");
		}
		
	}
}