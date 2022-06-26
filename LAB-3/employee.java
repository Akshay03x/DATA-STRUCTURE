// Create class Employee_Detail with attributes Employee_id, Name, Designation, and Salary. Write a 
// program to read the detail from user and print it. 
import java.util.Scanner;
class employeee{
	int emp_id;
	String name;
	String designation;
	Double salary;

	Scanner sc= new Scanner(System.in);
 
 	public void display(){
 		System.out.println("enter emp_id");
 		emp_id=sc.nextInt();
 		System.out.println("eneter name");
 		name =sc.next();
 		System.out.println("enter Designation");
 		designation =sc.next();
 		System.out.println("enter Salary");
 		salary =sc.nextDouble();

 		System.out.println("detail is---------------------");

 		System.out.println("emp_id"+emp_id);
 		System.out.println("name"+name);
 		System.out.println("designation"+designation);
 		System.out.println("salary"+salary);
 	}

}


public class employee{
	public static void main(String[] args) {
		employeee e1= new employeee();
		e1.display();
	}
}