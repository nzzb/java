package text;

public class RegularPolygon {
    private int n = 3;
    private double side = 1, x = 0, y = 0;

    public RegularPolygon() {
    }

    public RegularPolygon(int a, double b) {
        n = a;
        side = b;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int a, double b, double c, double d) {
        n = a;
        side = b;
        x = c;
        d = y;
    }

    public int getn() {
        return this.n;
    }

    public double getside() {
        return this.side;
    }

    public double getx() {
        return this.x;
    }

    public double gety() {
        return this.y;
    }

    public void setn(int a) {
        n = a;
    }

    public void setside(int a) {
        side = a;
    }

    public void setx(double a) {
        x = a;
    }

    public void sety(double a) {
        y = a;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}
