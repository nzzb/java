package eleven;

public class PolymorphismDemo {
	//Display circle and rectangle properties��ʾԲ�;�������
    public static void main(String[] args) {
        displayObject(new Circle(1, "red", false));
        displayObject(new Rectangle(1, 1, "black", true));
    }

    //Display geometric object properties��ʾ���ζ�������
    public static void displayObject(GeometricObject object) {
        System.out.println("Create on " + object.getDateCreated() + ". Color is " + object.getCo1or());
    }
}
