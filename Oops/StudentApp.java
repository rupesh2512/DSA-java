
package Oops;
import java.util.Scanner;

class Student
{
	//Data-Security
	private int rollNo;
	private String name;
	private String address;

	//setter methods
	public void setRollNo(int rollNo){
		this.rollNo=rollNo;
	}

	public void setName(String name){
		this.name =name;
	}	

	public void setAddress(String address){
		this.address =address;
	}

	//getter methods
	public int getRollNo(){
		return rollNo;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
}

public class StudentApp 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Scanner sc =new Scanner(System.in);
		//calling setter methods
		System.out.println("enter roll no");
		s1.setRollNo(sc.nextInt());
		System.out.println("enter name");
		s1.setName(sc.nextLine());
		System.out.println("enter address");
		s1.setAddress(sc.nextLine());

		//calling getter methods
		System.out.println("RollNo  is :: "+s1.getRollNo());
		System.out.println("Name    is :: "+s1.getName());
		System.out.println("Address is :: "+s1.getAddress());

	}
}
