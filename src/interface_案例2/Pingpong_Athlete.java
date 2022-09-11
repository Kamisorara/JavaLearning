package interface_案例2;

//这个是具体类
public class Pingpong_Athlete extends Athlete implements English_Learn {
    @Override
    public void learn() {
        System.out.println("learn Pingpong");
    }

    @Override
    public void learnEnglish() {
        System.out.println("要学英语");
    }

    public Pingpong_Athlete() {
    }

    public Pingpong_Athlete(String name, int age) {
        super(name, age);
    }

    public void play() {
        System.out.println("play Pingpong");
    }
}
