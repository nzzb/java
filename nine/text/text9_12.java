package text;

import java.util.Scanner;
//LinearEquation
public class text9_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the point 1:(x1, y2), (x2, y2): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("Enter the point 1:(x3, y3), (x4, y4): ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        LinearEquation line = new LinearEquation((y2 - y1), (x1 - x2), y1 * (x1 - x2) - x1 * (x1 - x2), (y4 - y3),
                (x3 - x4), y3 * (x3 - x4) - x3 * (x3 - x4));
        if (!line.isSolvable()) {
            System.out.println("The equation has no solution");
        } else {
            System.out.println(line.getX() + " " + line.getY());
        }
    }

}
