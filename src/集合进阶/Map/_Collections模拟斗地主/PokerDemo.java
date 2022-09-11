package 集合进阶.Map._Collections模拟斗地主;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    //需求:
    //通过程序实现斗地主过程中的洗牌，发牌和看牌
    //思路:
    //1:创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现2:往牌盒里面装牌
    //3:洗牌，也就是把牌打撒，用collections的shufflLe()方法实现4:发牌，也就是遍历集合，给三个玩家发牌
    //5:看牌，也就是三个玩家分别遍历自己的牌
    public static void main(String[] args) {
        //1:创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现2:往牌盒里面装牌
        ArrayList<String> array = new ArrayList<>();
        /*装牌
        ♦2.....♦A
        ♣2....♣A
        ♥2...♥A
        ♠2...♠A
        小王，大王
         */
        //先定义花色数组
        String[] colors = {"♦", "♣", "♥", "♠" };
        //定义点数数组
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k", "A" };
        //做一个拼接
        for (String color : colors) {
            for (String number : numbers) {
                //拼接
                array.add(color + number);
            }
        }
        array.add("小王");
        array.add("大王");
//        3:洗牌，也就是把牌打撒，用collections的shufflLe()方法实现4:发牌，也就是遍历集合，给三个玩家发牌
        Collections.shuffle(array); //这样牌就洗完了
        //发牌
        ArrayList<String> zsArray = new ArrayList<>();
        ArrayList<String> fwktArray = new ArrayList<>();
        ArrayList<String> kaArray = new ArrayList<>();
        ArrayList<String> dpArray = new ArrayList<>();  //底牌

        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);


            if (i >= array.size() - 3) {
                //发底牌
                dpArray.add(poker);

            } else if (i % 3 == 0) {
                zsArray.add(poker);
            } else if (i % 3 == 1) {
                fwktArray.add(poker);
            } else if (i % 3 == 2) {
                kaArray.add(poker);
            }
        }
        //看牌 三个玩家分别遍历自己的牌
        lookPoker("张三", zsArray);
        lookPoker("法外狂徒", fwktArray);
        lookPoker("Kamisora", kaArray);

    }

    //定义看牌方法
    public static void lookPoker(String name, ArrayList<String> array) {
        System.out.println(name + "的牌是:");
        for (String poker : array) {
            System.out.print(poker + "");
        }
        System.out.println();//用作换行

    }
}
