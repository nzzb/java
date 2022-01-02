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
		/**ͨ���ڹ��췽����ֱ��ʹ��������color��fi11ed��������ʾ:
		 * pub1ic Circle(double radius��string color, boolean fi11ed){
		 * 	this.radius = radius;
		 *  this.color = color;//illegal
		 *  this.filled = filled;//illegal
		 * }
		 * ���Ǵ���ģ���ΪGeometricObject���е�˽��������color��filled�ǲ��ܱ�����GeometricObject�౾��֮��������κ�����ʵġ�Ψһ��ȡ�͸ı�color��fi11ed�ķ�������ͨ�����ǵĻ�ȡ���������÷�����*/
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
	/**Return perimeter.�ܳ�*/
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	/**Print the circle info*/
	public void printCricle() {
		System.out.println("The circle is created "+getDateCreated()+" and the radius is "+radius);
	}
}
