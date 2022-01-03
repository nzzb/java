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
//�ɿ���̨���չ̶���ʽ����ѧ����Ϣ������ѧ�ţ�������������Ϣ�������������Ϊexit�˳����������ѧ����Ϣ�ֱ��װ��һ��Student�����У��ٽ�ÿ��Student������뵽һ�������У�Ҫ�󼯺��е�Ԫ�ذ��������С�����������������ϣ���������ѧ����Ϣд�뵽���±���ÿ��ѧ������ռ����һ��
public class system {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//����HashSet����
		Set<Student> students = new TreeSet<Student>();
		String name, id;
		int age;

		while (true) {
			System.out.print("����ѧ������(��������exit)��");
			name = input.next();
			if (name.equalsIgnoreCase("exit")) {
				break;
			}
			System.out.print("����ѧ��ѧ�ţ�");
			id = input.next();
			System.out.print("����ѧ�����䣺");
			age = input.nextInt();
			students.add(new Student(name, id, age));
		}
		File file = new File("Student.txt");
		try {
			OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream(file), "utf-8");
			output.append("ѧ�š�����������\n");
			//��������
			Iterator<Student> it = students.iterator();
			while (it.hasNext()) {
				Student temp = (Student) it.next();
				output.append(temp.getId() + " " + temp.getName() + " " + temp.getAge() + "\n");
			}
			output.flush();
		} catch (FileNotFoundException e) {
			System.out.println("�ļ������ڻ����ļ����ɶ������ļ���Ŀ¼");
		} catch (IOException e) {
			System.out.println("��ȡ���̴����쳣");
		}
	}
}
