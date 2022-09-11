package 枚举类;

public class Student {
    private final String name;
    private final int age;
    private Status status;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
