// A number is said to be Buzz Number if it ends with 7 or is divisible by 7.
 // Example: 1007 is a Buzz Number.
import java.util.Scanner;
public class Buzz{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter number");
		int a=sc.nextInt();

		if(((a%10)==7)  ||((a/7)==0)){
			System.out.println("Buzz number ");
		}
		else{
			System.out.println("not Buzz number");
		}
	}
}