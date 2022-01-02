package nine;
import java.util.Scanner;
public class TestPoint2D {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter point1's x-,y-coordina:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Enter point2's x-,y-coordina:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		Point2D p1 =new Point2D(x1,y1);//Point2D用于表示二维平面的点
		Point2D p2 =new Point2D(x2,y2);
		System.out.println("p1 is "+p1.toString());//toString()用于返回该对象的字符串
		System.out.println("p1 is "+p2.toString());
		System.out.println("The distance between p1 and p2 is "+p1.distance(p2));
		System.out.println("The midpoint between p1 and p2 is "+p1.midpoint(p2).toString());
		//distance(p2)返回两个点之间的距离；midpoint返回两点的中点
	}
}
