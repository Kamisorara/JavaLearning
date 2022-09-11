package interface_案例2;

public abstract class Athlete extends Human {
    @Override
    public void eat() {
        System.out.println("eat better than Coach");
    }

    public Athlete() {
    }

    public Athlete(String name, int age) {
        super(name, age);
    }

    public abstract void learn();


}
