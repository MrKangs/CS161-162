/*Problem Description:
Define the Circle2D class that contains:
•	Two double data fields named x and y that specify the center of the circle with get methods.

•	A data field radius with a get method.

•	A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1 for radius.

•	A constructor that creates a circle with the specified x, y, and radius.

•	A method getArea() that returns the area of the circle.

•	A method getPerimeter() that returns the perimeter of the circle.

•	A method contains(double x, double y) that returns true
	if the specified point (x, y) is inside this circle. See Figure 10.14(a).

•	A method contains(Circle2D circle) that returns true if the specified circle is inside this circle. See Figure 10.14(b).

•	A method overlaps(Circle2D circle) that returns true if the specified circle overlaps with this circle.
	See the figure below.

Figure
(a) A point is inside the circle.
(b) A circle is inside another circle.
(c) A circle overlaps another circle.

Draw the UML diagram for the class. Implement the class.
Write a test program that creates a Circle2D object c1
(new Circle2D(2, 2, 5.5)), displays its area and perimeter,
and displays the result of c1.contains(3, 3),
c1.contains(new Circle2D(4, 5, 10.5)), and
c1.overlaps(new Circle2D(3, 5, 2.3)).


*/
 public class Circle2D{

	//declare the variables
	double x,y,radius;

	Circle2D(){
		//set default values
		x = 0;
		y = 0;
		radius = 1;
	}

	Circle2D(double x_axis, double y_axis, double Radius){
		//not default values changes
		this.x = x_axis;
		this.y = y_axis;
		this.radius = Radius;
	}

	double getArea(){
		//As you see the name of the method
		return Math.PI * radius * radius;
	}

	double getperimeter(){
		//As you see the name of the method
		return 2 * Math.PI * radius;
	}

	boolean containPoint(double xPoint , double yPoint){
		//if the distance from the center of the circle to the new point is less than the circle radius, it will turn true.
		return Math.sqrt(Math.pow(xPoint - x,2) + Math.pow(yPoint - y,2)) <= radius;
	}

	boolean contains(Circle2D circle){
		//if the new circle radius is bigger than the circle1 radius, then return true
		return (Math.sqrt(Math.pow(circle.x - x,2) + Math.pow(circle.y - y,2))+ radius) <= circle.radius;
	}

	boolean overlaps(Circle2D circle){
		//if the new circle radius plus circle1 radius is smaller than the distance between two centers of the circles, then it will be true.
		return Math.sqrt(Math.pow(circle.x - x,2) + Math.pow(circle.y - y,2)) < radius+ circle.radius;
	}

}