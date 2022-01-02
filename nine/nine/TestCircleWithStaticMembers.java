package nine;

public class TestCircleWithStaticMembers {
	public static void main(String[] args)
	{
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is "+CircleWithStaticMembers.numberOfObjects);
		CircleWithStaticMembers c1=new CircleWithStaticMembers();
		//Display c1 before c2 is created.
		System.out.println("After creating c1");
		System.out.println("c1: radius ("+c1.radius+") and number of Circle objects ("+c1.numberOfObjects+")");
		CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
		c1.radius = 9;
		//Display c1 and c2 after c2 was created.
		System.out.println("After creating c2 and modifying c1");
		System.out.println("c1: radius ("+c1.radius+") and number of Circle objects ("+c1.numberOfObjects+")");
		System.out.println("c2: radius ("+c2.radius+") and number of Circle objects ("+c2.numberOfObjects+")");		
	}
}
