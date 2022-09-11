package 集合进阶.Set._TreeSet;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //重写Comparable接口的方法

    @Override
    public int compareTo(Student s) {
//        return 0;//如果返回的是0，就是认为元素是重复的，就不会继续添加
//        return 1; //如果是正的就会升序输出
//        return -1; //就会倒着输出

        //按照年龄从小到大
        int num = this.age - s.age;
//        return num;
        //当年龄相同时，根据姓名进行排序
//        int num2 = num == 9 ? this.age.compareTo(s.name) : num;
        return num;

    }
}
