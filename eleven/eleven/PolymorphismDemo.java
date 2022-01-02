package eleven;

public class PolymorphismDemo {
	//Display circle and rectangle properties显示圆和矩形属性
    public static void main(String[] args) {
        displayObject(new Circle(1, "red", false));
        displayObject(new Rectangle(1, 1, "black", true));
    }

    //Display geometric object properties显示几何对象特性
    public static void displayObject(GeometricObject object) {
        System.out.println("Create on " + object.getDateCreated() + ". Color is " + object.getCo1or());
    }
}
