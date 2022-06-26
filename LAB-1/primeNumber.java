import java.util.Scanner;
public class primeNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");

		int n=sc.nextInt();
		int flag=0;
		for(int i=2;i<n;i++){
			if(n%i==0){
				flag=1;
			}
		}
		if (flag==1){
			System.out.println("number is not prime:"+n);
		}
		else{
			System.out.println("number is   prime:"+n);
		}
	}
}