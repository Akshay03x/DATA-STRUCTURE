import java.util.Scanner;
public  class recursionFact{

	static int fact(int x){
		if(x==1){
			return 1;
		}
		else{
			return(x*fact(x-1));
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();

		System.out.println("fact of your number is:"+fact(n));
	}
	
}