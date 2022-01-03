package school;

public class Student implements Comparable<Student>{
    private String id;
    private String name;
    private int age;

    public Student() {
    	this.id = "NULL";
        this.name = "NULL";
        this.age = -1;
    }

    public Student(String name, String id, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    @Override
    //自排序
    public int compareTo(Student o) {
        if (!(o instanceof Student))
            throw new RuntimeException("不是student类");
        Student p = (Student) o;
        if (this.age > p.age) {
            return 1;
        } else if (this.age == p.age) {
            return 0;
        } else {
            return -1;
        }
    }
}
