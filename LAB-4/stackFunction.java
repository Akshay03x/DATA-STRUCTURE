// import java.util.Scanner;
// public class stackFunction{
// 	public static void push(int[] a,int top,int x){
// 		if(top>a.length){
// 			System.out.println("stack overflow");
// 		}
// 		else{
// 			top++;
// 			a[top-1]=x;
// 		}
// 	}

// 	// public static int pop(int a[],int top){
// 	// 	if(top<=0){
// 	// 		System.out.println("stack underflow");
// 	// 		// return 0;
// 	// 	}
// 	// 	else{
// 	// 		top=top-1;
// 	// 		return a[top];
// 	// 	}
// 	// 	return 0;
// 	// }

// 	public static int peep(int a[],int top, int i){
// 		if(top-i+1<=0){
// 			System.out.println("stack under flow");
// 		}
// 		else{
// 			return a[top-i+1];
// 		}
// 		return 0;
// 	}


// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);

// 		System.out.println("enter array size");
// 		int n=sc.nextInt();
// 		int a[]=new int[n];
// 		int y;
// 		//-------push--------------------------//
// 		for(int top=1;top<=n;top++){
// 			System.out.println("enter "+(i+1)+" element:");
// 			y=sc.nextInt();
// 			push(a,top,y);
// 		}


// 		//----------------------------display--------------------//
// 		// for(int i=0;i<n;i++){
// 		// 	System.out.println("top["+(i+1)+"]:"+a[i]);
// 		// }

// 		//------------------------------pop-----------------------//
// 		// for(int i=a.length;i>=0;i--){
// 		// 	if(i==0){
// 		// 		break;
// 		// 	}
// 		// 	System.out.println("element at"+"top["+(i)+"]:"+pop(a,i));
// 		// }

// 		//-----------------------------peep------------------------//
// 		System.out.println("enter element at the top");
// 		int i=sc.nextInt();
// 		peep(a,top,i);

// 	}
// }

import java.util.*;;
public class stackFunction {

    static int top;

    public static void push(int[] arr, int top, int x) {
        if (top >= arr.length)
            System.out.println("Stack Overflow");
        else {
            top++;
            stackFunction.top++;
            arr[top - 1] = x;
        }
    }

    public static void pop(int[] arr, int top) {
        if (top <= 0)
            System.out.println("Stack Underflow");
        else {
            top--;
            stackFunction.top--;
            arr[top] = 0;
        }
    }

    public static int peep(int[] arr, int top, int i) {
        if (top - i + 1 <= 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else
            return arr[top - i];
    }

    public static void change(int[] arr, int top, int i, int x) {
        if (top - i + 1 <= 0)
            System.out.println("Stack Underflow");
        else
            arr[top - i] = x;
    }

    public static void display(int[] a, int i) {
        if (i > a.length || i <= 0)
            System.out.println("Elemnt does not exist ");
        else
            System.out.println("Element " + i + " of the stak is " + a[i - 1]);
    }

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int[] a = new int[4];
		int y;

		for(int i=1;i<=a.length;i++){
			y=sc.nextInt();
			push(a, top, y);	
		}

        pop(a, top);

        System.out.println(peep(a, top, 1));

        change(a, top, 1, 10);

        display(a, 2);
    }
}