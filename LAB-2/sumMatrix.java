// . Read two 2x2 matrices and perform addition of matrices into third matrix and print it.
import java.util.Scanner;
public class sumMatrix{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int ar1[][]=new int[2][2];
		int ar2[][]=new int[2][2];


		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print("ar1["+i+"]"+"["+j+"]=");
				ar1[i][j]= sc.nextInt();
			}
		}

		System.out.println("enter second array:");

		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print("ar1["+i+"]"+"["+j+"]=");
				ar2[i][j]= sc.nextInt();
			}
		}

		int ar3[][]=new int[2][2];

		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				ar3[i][j]=(ar1[i][j]+ar2[i][j]);
			}
		}

		System.out.println("first matrix:");

		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(ar1[i][j]+"  ");
			}
			System.out.println();
		}		


		System.out.println("second matrix:");

		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(ar2[i][j]+"  ");
			}
			System.out.println();
		}

		System.out.println("sum of two matrix is");

		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(ar3[i][j]+"  ");
			}
			System.out.println();
		}		

	}
}