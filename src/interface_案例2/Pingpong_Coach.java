package interface_案例2;

public class Pingpong_Coach extends Coach implements English_Learn {
    @Override
    public void learnEnglish() {
        System.out.println("要学英语");
    }

    @Override
    public void teach() {
        System.out.println("teach Pingpong");
    }

    public Pingpong_Coach() {
    }

    public Pingpong_Coach(String name, int age) {
        super(name, age);
    }

    public void speak() {
        System.out.println("教PingPong");
    }
}
