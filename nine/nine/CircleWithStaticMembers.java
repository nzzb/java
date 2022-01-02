package nine;

public class CircleWithStaticMembers {
	double radius;
	/**The number of objects created.创建静态变量，静态变量可以作用于同一个类的不同对象中*/
	static int numberOfObjects = 0;
	/**Construct a circle with radius 1*/
	CircleWithStaticMembers()
	{
		radius = 1;
		numberOfObjects++;
	}
	/**Construct a circle with a specified radius.指定半径*/
	CircleWithStaticMembers(double newRadius)
	{
		radius=newRadius;
		numberOfObjects++;
	}
	/**Return numberOfObjects.静态方法*/
	static int getNumberOfObjects()
	{
		return numberOfObjects;
	}
	double getArea()
	{
		return radius*radius*Math.PI;
	}
	
}
