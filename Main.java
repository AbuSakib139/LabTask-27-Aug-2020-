import java.lang.Math;
import java.util.Scanner;

public class Main{
	
	public static void main(String args[]){
	System.out.println(" ");

	Scanner sc = new Scanner(System.in);

	System.out.println("Press 1 if you want to see the Circle part\nPress 2 if you want to see Square part\nPress 3 if you want to see Triangle part  ");
	System.out.println(" ");
	System.out.print("Your requested number is : ");
	int A = sc.nextInt();

	System.out.println(" ");

	Circle object = new Circle();
	Square object1 = new Square();
	Triangle object2 = new Triangle();

	if(A==1){
		System.out.println("You requested for Circle. Here are the properties.");
		System.out.println(" ");
		System.out.print("Enter the redius of circle : ");
		double circle = sc.nextDouble();

		System.out.println(" ");
		System.out.println("The area of the circle is : " +object.Area(circle));
		System.out.println("The boundary length of the circle is : " +object.boundary_length(circle));
		System.out.println(" ");
		}



	else if(A==2){
		System.out.println("You requested for Square. Here are the properties. ");
		System.out.println(" ");
		System.out.print("Enter the length of square : ");
		double square = sc.nextDouble();

		System.out.println(" ");
		System.out.println("The area of the square is : " +object1.Area(square));
		System.out.println("The boundary length of the square is : " +object1.boundary_length(square));
		System.out.println(" ");	
		}



	else if(A==3){
		System.out.println("You requested for Equilateral Triangle. Here are the properties. ");
		System.out.println(" ");
		System.out.print("Enter the side of triangle : ");
		double triangle = sc.nextDouble();

		System.out.println(" ");
		System.out.println("The area of the Triangle is : " +object2.Area(triangle));
		System.out.println("The boundary length of the Triangle is : " +object2.boundary_length(triangle));
		System.out.println(" ");	
		}

	else{
		System.out.println("Invalid entry! Try again.");
		}	

	}


}