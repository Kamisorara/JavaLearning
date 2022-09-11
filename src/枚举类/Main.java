package 枚举类;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Kamisora", 100);
        st1.setStatus(Status.SLEEP);
        System.out.println(st1.getStatus().getName());
        for (Status value : Status.values()) {
            System.out.println(value);  //在增强for里快速查看所有枚举
        }
    }
}
