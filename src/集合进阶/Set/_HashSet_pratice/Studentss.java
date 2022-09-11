package 集合进阶.Set._HashSet_pratice;

public class Studentss {
    private String name;
    private int age;

    public Studentss() {
    }

    public Studentss(String name, int age) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Studentss studentss = (Studentss) o;

        if (age != studentss.age) return false;
        return name != null ? name.equals(studentss.name) : studentss.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
