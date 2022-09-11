package interface_案例2;

public class Demo_test {
    public static void main(String[] args) {
        //创建实例
        //使用的时候肯定是使用具体类里的方法，因为这样最全面
        Pingpong_Athlete po = new Pingpong_Athlete();
        po.setName("PingPong player");
        po.setAge(10);
        System.out.println(po.getName() + po.getAge());
        po.play();
        po.learnEnglish();
        po.learn();
        System.out.println("--------------------------------");
        Basketball_Athlete ba = new Basketball_Athlete("basketball player", 10);
        System.out.println(ba.getName() + ba.getAge());
        ba.play();
        ba.learn();
        System.out.println("--------------------------------");
        Basketball_Coach bco = new Basketball_Coach("bastetball coach", 100);
        System.out.println(bco.getName() + bco.getAge());
        bco.speak();
        System.out.println("---------------------------------");
        Pingpong_Coach pco = new Pingpong_Coach("PingPong coach", 10);
        System.out.println(pco.getName() + pco.getAge());
        pco.speak();
        pco.learnEnglish();
    }


}
