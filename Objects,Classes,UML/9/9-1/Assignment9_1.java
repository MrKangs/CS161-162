/*
9.1 (The Rectangle class) Following the example of the Circle
class in Section 9.2, design a class named Rectangle to represent
a rectangle. The class contains:

 бс Two double data fields named width and height that
 specify the width and height of the rectangle.
 The default values are 1 for both width and height.

 бс A no-arg constructor that creates a default rectangle.

 бс A constructor that creates a rectangle with
 the specified width and height.

 бс A method named getArea() that returns the area of this rectangle.

 бс A method named getPerimeter() that returns the perimeter.

Draw the UML diagram for the class and then implement the class.
Write a test program that creates two Rectangle objects?one with
width 4 and height 40 and the other
with width 3.5 and height 35.9.
Display the width, height, area, and perimeter of each rectangle
in this order
*/
public class Assignment9_1{
	public static void main(String args[]){
		//First Rectangle
		Rectangless rect1 = new Rectangless(4,40);
		System.out.println("The area of the rectangle is " + rect1.getArea() /* it returns the area value*/+
		" when the height is " + rect1.height/* it returns the height value*/
		+ " and the width is " + rect1.width /* it returns the width value*/
		+ ". Also, the perimeter is " + rect1.getPerimeter()/* it returns the perimeter value*/);

		//Second Rectangle
		Rectangless rect2 = new Rectangless(3.5,35.9);
		System.out.println("The area of the rectangle is " + rect2.getArea() /* it returns the area value*/+
				" when the height is " + rect2.height/* it returns the height value*/
				+ " and the width is " + rect2.width /* it returns the width value*/
		+ ". Also, the perimeter is " + rect2.getPerimeter()/* it returns the perimeter value*/);
	}
}

class Rectangless{

	//declaring the variables
	double width, height, area, perimeter;

	Rectangless(){
		width = 1;
		height = 1;
		area = 0;
		perimeter = 0;
	}
	//Method for the width and the height in this class only with new terms

	Rectangless(double WIDTH, double HEIGHT){
		this.width = WIDTH;
		this.height = HEIGHT;
	}
	//This Method is solving the area

	public double getArea(){
		area = width*height;
		return area;
	}
	//This Method is solving the perimeter
	public double getPerimeter(){
		perimeter = (2 * width) + (2 * height);
		return perimeter;
	}

}


