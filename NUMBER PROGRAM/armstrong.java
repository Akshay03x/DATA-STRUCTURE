import java.util.Scanner;
public class armstrong{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter number");
		int a=sc.nextInt();
		int temp=a;
		int x,mul=0;
		while(a>0){
			x=a%10;
			mul=mul+(x*x*x);
			a=a/10;
		}
		if(mul==temp){
			System.out.println("armstrong");
		}
		else{
			System.out.println("not armstrong");
		}
	}
}