package _Arraylist;

/*
学生类
 */
public class Student {
    private String name;
    private int age;

    //首先无参构造
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


}
