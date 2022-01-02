package nine;

public class CircleWithStaticMembers {
	double radius;
	/**The number of objects created.������̬��������̬��������������ͬһ����Ĳ�ͬ������*/
	static int numberOfObjects = 0;
	/**Construct a circle with radius 1*/
	CircleWithStaticMembers()
	{
		radius = 1;
		numberOfObjects++;
	}
	/**Construct a circle with a specified radius.ָ���뾶*/
	CircleWithStaticMembers(double newRadius)
	{
		radius=newRadius;
		numberOfObjects++;
	}
	/**Return numberOfObjects.��̬����*/
	static int getNumberOfObjects()
	{
		return numberOfObjects;
	}
	double getArea()
	{
		return radius*radius*Math.PI;
	}
	
}
