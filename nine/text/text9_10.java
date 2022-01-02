package text;

import java.util.Scanner;

import javax.swing.text.html.StyleSheet;
//text QuadraticEquation
public class text9_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter input a,b,c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double eps = 0.00001;
        QuadraticEquation ans = new QuadraticEquation(a, b, c);
        if (ans.getDiscriminanc() > eps) {
            System.out.println("Root1: " + ans.getRoot1() + " Root2: " + ans.getRoot2());
        } else if (-eps < ans.getDiscriminanc() && ans.getDiscriminanc() < eps) {
            System.out.println("Root: " + ans.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }

}
