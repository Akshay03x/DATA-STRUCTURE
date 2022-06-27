//Create array of object of class Student_Detail with attributes Enrollment_no, Name, Sem, CPI for 5 
//students, scan their information and print it.


import java.util.Scanner;
class student{
	long enroll;
	String name;
	int  sem;
	Double cpi;

	Scanner sc= new Scanner(System.in);
 
 	public void input(){
 		System.out.println("enter enroll");
 		enroll=sc.nextLong();
 		System.out.println("eneter name");
 		name =sc.next();
 		System.out.println("enter sem");
 		sem =sc.nextInt();
 		System.out.println("enter cpi");
 		cpi =sc.nextDouble();
 	}

 	public void display(){
 		System.out.println("enroll"+enroll);
 		System.out.println("name"+name);
 		System.out.println("sem"+sem);
 		System.out.println("cpi"+cpi);
 	}

}


public class arrayOfObject{
	public static void main(String[] args) {
		student[] s=new student[5];
		for(int i=0;i<5;i++){
			System.out.println("enter "+(i+1)+" student detail-----");
			s[i]=new student();
			s[i].input();
		}
		for(int i=0;i<5;i++){
			System.out.println("detail of student no."+(i+1)+"------------");
			s[i].display();
		}


	}
}