package text;
//text RegularPolygon
public class text9_9 {
    public static void main(String[] args) {
        RegularPolygon temp1 = new RegularPolygon();
        RegularPolygon temp2 = new RegularPolygon(6, 4.0);
        RegularPolygon temp3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("RegularPolygon 1 Perimeter: "+temp1.getPerimeter()+" Area: "+temp1.getArea());
        System.out.println("RegularPolygon 2 Perimeter: "+temp2.getPerimeter()+" Area: "+temp2.getArea());
        System.out.println("RegularPolygon 3 Perimeter: "+temp3.getPerimeter()+" Area: "+temp3.getArea());
    }

}
