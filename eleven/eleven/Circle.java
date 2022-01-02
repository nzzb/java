package eleven;

public class Circle extends GeometricObject{
	private double radius;
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	public Circle(double radius,String color,boolean filled) {
		this.radius=radius;
		setColor(color);
		setFilled(filled);
		/**通过在构造方法中直接使用数据域color和fi11ed，如下所示:
		 * pub1ic Circle(double radius，string color, boolean fi11ed){
		 * 	this.radius = radius;
		 *  this.color = color;//illegal
		 *  this.filled = filled;//illegal
		 * }
		 * 这是错误的，因为GeometricObject类中的私有数据域color和filled是不能被除了GeometricObject类本身之外的其他任何类访问的。唯一读取和改变color与fi11ed的方法就是通过它们的获取方法和设置方法。*/
	}
	/**Return radius*/
	public double getRadius() {
		return radius;
	}
	/**set a new radius*/
	public void setRadius(double radius) {
		this.radius=radius;
	}
	/**Return area*/
	public double getArea() {
		return radius*radius*Math.PI;
	}
	/**Return diameter*/
	public double getDiameter() {
		return 2*radius;
	}
	/**Return perimeter.周长*/
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	/**Print the circle info*/
	public void printCricle() {
		System.out.println("The circle is created "+getDateCreated()+" and the radius is "+radius);
	}
}
