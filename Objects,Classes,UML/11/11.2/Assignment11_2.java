import java.util.*;

public class Assignment11_2{
	public static void main(String [] args){
	}
}

class Person{
	public String name;
	public String address;
	public String phoneNumber;
	public String email;

	@Override
	public String toString(){
		return "Person";
	}
}

class Student1 extends Person{
	public static int F = 1;
	public static int SO = 1;
	public static int J = 1;
	public static int SE = 1;

	public int status;

	@Override
	public String toString(){
		return "Student";
	}
}

class Employee extends Person{
	public String Office;
	public int salary;
	public Calendar dateHired;

	@Override
	public String toString(){
		return "Employee";
	}
}

class Faculty extends Employee{
	public static int Lecturer = 1;
	public static int Assistant_Pro = 2;
	public static int Associate_Pro = 3;
	public static int Pro = 4;

	public String OfficeHours;
	public int rank;

	@Override
	public String toString(){
		return "Faculty";
	}
}

class Staff extends Employee{
	public String title;

	@Override
	public String toString(){
		return "Staff's title is " + title;
	}
}