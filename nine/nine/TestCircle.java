package nine;

public class TestCircle {
	public static void main(String[] args) {
		//Create a circle with radius 1
		CircleWithStaticMembers circle1 =new CircleWithStaticMembers();
		System.out.println ( "The area of the circle of radius "+ circle1.radius + " is " +circle1.getArea());
		//Create a circle with radius25
		CircleWithStaticMembers circle2 =new CircleWithStaticMembers(25);
		System. out.println("The area of the circle of radius "+ circle2.radius + " is " + circle2. getArea()) ;
		// Create a circle with radius 125
		CircleWithStaticMembers circle3 = new CircleWithStaticMembers(125);
		System.out.println ( "The area of the circle of radius "+ circle3 .radius + " is " + circle3.getArea( ) );
		//Modify circle radius
		circle2.radius =100; // or circle2 .setRadius (100)
		System. out .println("The area of the circle of radius "+ circle2.radius + " is " +circle2 . getArea());
		//Define the circ1e class with two constructors
	}
}
class Circle//circle¿‡
{
	double radius;
	/**Construct a circle with radius 1 */
	Circle(){
		radius =1;
	}
	/** Construct a circle with a specified radius */
	Circle(double newRadius) {
		radius =newRadius;
	}
	/**Return the area of this circle */
	double getArea() {
		return radius * radius * Math.PI;
	}
	/**Return the perimeter of this circle */
	double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	/**Set a new radius for this circle*/
	void setRadius(double newRadius) {
		radius = newRadius;
	}
}
