import java.util.Scanner;
public class timeDegree{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter hour:");
		int h=sc.nextInt();
		System.out.println("enter minut:");
		int m=sc.nextInt();

		if(h==12){h=0;}
		if(m==60){m=0;}

		int hAngle,mAngle;

		hAngle=(h*30)+(m/2);
		mAngle=(m*6);

		int angle=Math.abs(hAngle- mAngle);
		System.out.println("angle :"+angle);

	}
}