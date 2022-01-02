package nine;

public class CircleWithPrivateDataFields {
	private double radius = 1;//设置私有域数据
	private static int numberOfObjects = 0;
	public CircleWithPrivateDataFields()
	{
		numberOfObjects++;
	}
	public CircleWithPrivateDataFields(double newRadius)
	{
		radius=newRadius;
		numberOfObjects++;
	}
	public double getRadius()//外部通过该公共方法获取私有域数据radius
	{
		return radius;
	}
	public void setRadius(double newRadius)//外部通过该公共方法设置私有域数据radius值
	{
		radius = (newRadius>=0)?newRadius:0;
	}
	public static int getNumberOfObjects()
	{
		return numberOfObjects;
	}
	public double getArea()
	{
		return radius*radius*Math.PI;
	}
}
