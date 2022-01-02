package text;

import java.util.Scanner;
//text LinearEquation
public class text9_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        LinearEquation line = new LinearEquation(a, b, c, d, e, f);
        if (!line.isSolvable()) {
            System.out.println("The equation has no solution");
        } else {
            System.out.println(line.getX() + " " + line.getY());
        }
    }

}
