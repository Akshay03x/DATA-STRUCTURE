// An Automorphic number is a number whose square ends in the same digits as the number itself.
// Examples: 5*5 = 25, 6*6 = 36, 25*25 = 625
import java.util.Scanner;
public class Automorphic{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter number");
		int a=sc.nextInt();
		
		int x=a*a;
		System.out.println("-----"+x);
		if((a%10)== (x%10)){
			System.out.println("Automorphic number ");
		}
		else{
			System.out.println("not Auto morphic");
		}
	}
}