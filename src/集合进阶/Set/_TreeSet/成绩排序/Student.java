package 集合进阶.Set._TreeSet.成绩排序;

public class Student {
    //需求:用TreeSet集合存储多个学生信息(姓名，语文成绩，数学成绩)，并遍历该集合
    //要求:按照总分从高到低出现
    private String name;
    private int chinese;
    private int math;

    public Student() {
    }

    public Student(String name, int chinese, int math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
}
