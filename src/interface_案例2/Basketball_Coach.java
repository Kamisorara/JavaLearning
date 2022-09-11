package interface_案例2;

public class Basketball_Coach extends Coach {
    @Override
    public void teach() {
        System.out.println("教篮球");
    }

    public Basketball_Coach() {
    }

    public Basketball_Coach(String name, int age) {
        super(name, age);
    }

    public void speak() {
        System.out.println("教篮球");
    }
}
