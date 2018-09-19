public class testthis{
	public static void main(String []args){
		Circle2D c1 = new Circle2D(2,2,5.5);

		System.out.println("Circle1 area: " + c1.getArea());
		System.out.println();
		System.out.println("Circle1 perimeter: " + c1.getperimeter());
		System.out.println();
		System.out.println("Does point (3,3) contains in the circle? " + c1.containPoint(3,3));
		System.out.println();
		System.out.println("Does a new circle at the center of the point is (4,5) \nand the radius 10.5 contains the circle inside? "+ c1.contains(new Circle2D(4,5,10.5)));
		System.out.println();
		System.out.println("Does a new circle at the center of the point is (3,5) \nand the radius 2.3 overlaps the main circle?: " + c1.overlaps(new Circle2D(3,5,2.3)));
		System.out.println();
		}
}
