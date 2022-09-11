package interface_案例2;

public abstract class Coach extends Human  {
    @Override
    public void eat() {
        System.out.println("eat shit");
    }

    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();

}
