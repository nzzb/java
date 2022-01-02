package eleven;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
    	//Create a list to store cities创建列表
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");
        //列表：{London, Denver, Paris, Miami, Seoul, Tokyo}

        System.out.println("List size? " + cityList.size());
        System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
        System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
        System.out.println("Is the list empty? " + cityList.isEmpty());

        //Insert a new city at index 2插入
        cityList.add(2, "Xian");
        //列表：{London, Denver, xian, Paris, Miami, Seoul, Tokyo}

        //Remove a city from the list删除
        cityList.remove("Miami");
        //列表：{London, Denver, xian, Paris, Seoul, Tokyo}

        //Remove a city at index 1移除
        cityList.remove(1);
        //列表：{London, xian, Paris, Seoul, Tokyo}

        //Display the contents in the list//"Print"
        System.out.println(cityList.toString());
        
        //Display the contents in the list in reverse order按相反顺序显示列表中的内容
        for (int i = cityList.size() - 1; i >= 0; i--)
            System.out.print(cityList.get(i) + " ");
        System.out.println();

        //Create a list to store two circle
        ArrayList<Circle> list = new ArrayList<>();

        list.add(new Circle(2));
        list.add(new Circle(3));

        //Display the area of the first circle in the list
        System.out.println("The area of the circle? " + list.get(0).getArea());
    }
}
