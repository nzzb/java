package nine;

public class TotalArea {
    public static void main(String[] args) {
    	//Declare circleArray 声明圆的数组
    	CircleWithPrivateDataFields[] circleArray;
        circleArray = createCircleArray();
        //Print circleArray and total area of the circles
        printCircleArray(circleArray);
    }

    /**Create an array of Circle objects创建圆类数组*/
    public static CircleWithPrivateDataFields[] createCircleArray() {
    	CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];
        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new CircleWithPrivateDataFields(Math.random() * 100);
        }
        return circleArray;
    }

    /**Print an array of circles and their total area*/
    public static void printCircleArray(CircleWithPrivateDataFields[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }
        System.out.println("_________________________________________________");
        //Compute and display the result计算并显示结果
        System.out.printf("%-30s%-15f\n", "The total area of circles is", sum(circleArray));
    }

    //Add circle area
    public static double sum(CircleWithPrivateDataFields[] circleArray) {
        double sum = 0;
        for (int i = 0; i < circleArray.length; i++)
            sum += circleArray[i].getArea();
        return sum;
    }
}
