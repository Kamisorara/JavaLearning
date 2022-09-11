package _File._byteStream.字符流.文件到集合升级版;

public class Student {
    //需求:把ArrayList集合中的学生数据写入到文本文件。要求:每一个学生对象的数据作为文件中的一行数据
    //格式:学号,姓名,年龄,居往地
    private String number;
    private String name;
    private int age;
    private String location;

    public Student() {
    }

    public Student(String number, String name, int age, String location) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (number != null ? !number.equals(student.number) : student.number != null) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return location != null ? location.equals(student.location) : student.location == null;
    }

    @Override
    public int hashCode() {
        int result = number != null ? number.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }
}
