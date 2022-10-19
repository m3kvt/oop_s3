import java.io.*;
import java.util.*;
class employee{
	String name;
	int age;
	long phone_number;
	String address;
	float salary;
	
	void printsalary(){
		System.out.println("Salary:"+salary);
	}
	 void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Age: ");
        age = sc.nextInt();
        System.out.println("Enter Phone number: ");
        phone_number= sc.nextLong();
        System.out.println("Enter Address: ");
        address = sc.nextLine();
        address = sc.nextLine();
        System.out.println("Enter Salary: ");
        salary= sc.nextFloat();
   }
	
	public static void main(String a[]){
		Scanner sc=new Scanner(System.in);
		employee e=new employee();
		
		officer o=new officer();
		System.out.println("Enter the details of officer:");
		o.read();
		System.out.println("Enter the specialization:");
		o.specialization=sc.nextLine();
		
		System.out.println("Enter the details of manager:");
		manager m=new manager();
		m.read();
		/*
		m.name=sc.nextLine();
		m.age=sc.nextInt();
		m.phone_number=sc.nextLine();
		m.address=sc.nextLine();*/
		System.out.println("Enter the department:");
		m.department=sc.nextLine();
		
		o.printsalary();
		m.printsalary();
		
	}
	
}
class officer extends employee{
	String specialization;
}
class manager extends employee{
	String department;
}
