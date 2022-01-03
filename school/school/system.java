package school;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;
import java.util.TreeSet;
//由控制台按照固定格式输入学生信息，包括学号，姓名，年龄信息，当输入的内容为exit退出；将输入的学生信息分别封装到一个Student对象中，再将每个Student对象加入到一个集合中，要求集合中的元素按照年龄大小正序排序；最后遍历集合，将集合中学生信息写入到记事本，每个学生数据占单独一行
public class system {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//建立HashSet集合
		Set<Student> students = new TreeSet<Student>();
		String name, id;
		int age;

		while (true) {
			System.out.print("输入学生名字(结束输入exit)：");
			name = input.next();
			if (name.equalsIgnoreCase("exit")) {
				break;
			}
			System.out.print("输入学生学号：");
			id = input.next();
			System.out.print("输入学生年龄：");
			age = input.nextInt();
			students.add(new Student(name, id, age));
		}
		File file = new File("Student.txt");
		try {
			OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream(file), "utf-8");
			output.append("学号、姓名、年龄\n");
			//迭代遍历
			Iterator<Student> it = students.iterator();
			while (it.hasNext()) {
				Student temp = (Student) it.next();
				output.append(temp.getId() + " " + temp.getName() + " " + temp.getAge() + "\n");
			}
			output.flush();
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在或者文件不可读或者文件是目录");
		} catch (IOException e) {
			System.out.println("读取过程存在异常");
		}
	}
}
