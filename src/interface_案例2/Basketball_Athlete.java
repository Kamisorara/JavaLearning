package interface_案例2;

public class Basketball_Athlete extends Athlete {
    @Override
    public void learn() {
        System.out.println("学篮球");
    }

    public Basketball_Athlete() {
    }

    public Basketball_Athlete(String name, int age) {
        super(name, age);
    }

    public void play() {
        System.out.println("打篮球");
    }
}
