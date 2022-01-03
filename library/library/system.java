package library;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

//使用链表和映射存放多个图书信息，遍历并输出。其中商品属性：编号，名称，单价，出版社；使用商品编号作为映射中的key。
public class system {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        List<Book> books = new ArrayList<Book>();
        Map<String,Book> books1 = new HashMap<String,Book>();
        System.out.print("输入书本数量：");
        int n = input.nextInt();
        for(int i = 0;i < n;++ i){
            String name,index,press,str;
            int price;
            System.out.print("输入书本编号：");
            index = input.next();
            System.out.print("输入书本名称：");
            name = input.next();
            System.out.print("输入书本单价：");
            price = input.nextInt();
            System.out.print("输入书本出版社：");
            press = input.next();
            Book x = new Book(index,name,price,press);
            books.add(x);
            books1.put(index,x);
        }
        //遍历所有书本
        Iterator it = books.iterator();
        while(it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
        //遍历所有编号映射的书
        Iterator it1 = books1.entrySet().iterator();
        while(it1.hasNext()){
            Map.Entry entry = (Map.Entry)it1.next();
            System.out.println("next :" + entry.getKey() + " " + ((Book)entry.getValue()).getName());
        }
	}
}
