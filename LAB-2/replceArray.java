// Read n numbers in an array then read two different numbers, replace 1st number with 2nd number 
// in an array and print its index and final array.

import java.util.Scanner;
public class replceArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size:");
		int x=sc.nextInt();
		int a[] =new int[x];

			for(int i=0;i<x;i++){
				System.out.print("a["+i+"]=");
				a[i]=sc.nextInt();
			}

			System.out.println("enter your array value :");
			int y=sc.nextInt();

			System.out.println("enter your  replace array value :");
			int z=sc.nextInt();

			int flag=0;
			for (int i=0;i<x;i++){
				if(a[i]==y){
					// System.out.println("your array index is :"+i);
					flag=1;
					a[i]=z;
					System.out.println("replace array at index :"+i);
					System.out.println("rapalce array at index_"+i+"_is:"+z);
				}

				
			}
			if(flag==0){
				System.out.println("value is not found in array");
				System.out.println("no change in array :");
			}
			for (int i=0;i<x;i++){
				System.out.println("a["+i+"]="+a[i]);
			}

	}
	
}