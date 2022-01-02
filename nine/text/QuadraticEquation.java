package text;

public class QuadraticEquation {
    private double a = 0, b = 0, c = 0;

    public QuadraticEquation(double x, double y, double z) {
        a = x;
        b = y;
        c = z;
    }

    public double geta() {
        return this.a;
    }

    public double getb() {
        return this.b;
    }

    public double getc() {
        return this.c;
    }

    public double getDiscriminanc() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }
}
