import java.util.*;
public class GPA{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your GPA?(Out of 4.0):\t");
		double GPA = sc.nextDouble();
		if (GPA >= 3.5){
			System.out.println("Welcome to Oregon State University");
		}else {
			System.out.println("Sorry, you did not meet the minimun GPA requirements");
	}if (4.0<=GPA){
		System.out.println("Wow you are a perfect student!");
	}else if(3.5<= GPA){
		System.out.println("Your are a good student in school!");
	}else if (3.0 <= GPA){
		System.out.println("You are an average student.");
	}else{
		System.out.println("You need to work hard to be a 4.0 student. WORK HARD!!!");
	} if (4.0<= GPA){
		System.out.println("You are an A/A+ Student");
	}else if (3.7 <= GPA){
		System.out.println("You are an A- Student");
	}else if(3.3<= GPA){
		System.out.println("You are a B+ Student");
	}else if(3.0<= GPA){
		System.out.println("You are a B Student");
	}else if(2.7<= GPA){
		System.out.println("You are a B- Student");
	}else if(2.3<= GPA){
		System.out.println("You are a C+ Student");
	}else if(2.0<= GPA){
		System.out.println("You are a C Student");
	}else if(1.7<= GPA){
		System.out.println("You are a C- Student");
	}else if(1.3<= GPA){
		System.out.println("You are a D+ Student");
	}else if(1.0<= GPA){
		System.out.println("You are a D Student");
	}else if(0.0<= GPA){
		System.out.println("You are a E/F Student");
	}}}
