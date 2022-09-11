package 集合进阶.Map._Collections模拟斗地主;

import java.util.*;

public class PoketDemo_2 {
    //需求:通过程序实现斗地主过程中的洗牌，发牌和看牌。要求:对牌进行排序
    //思路:
    //创建HashMap，键是编号，值是牌创建ArrayList，存储编号
    //3创建花色数组和点数数组
    //④从0开始往HashMap里面存储编号，并存储对应的牌。同时往ArrayList里面存储编号⑤洗牌(洗的是编号)，用Collections的shuffle(方法实现
    //发牌(发的也是编号，为了保证编号是排序的，创建TreeSet集合接收)
    //⑦定义方法看牌(遍历TreeSet集合，获取编号，到HashMap集合找对应的牌)⑧调用看牌方法
    public static void main(String[] args) {
        //创建HashMap，键是编号，值是牌创建ArrayList，存储编号
        HashMap<Integer, String> hm = new HashMap<>();
        //创建Arraylist存储编号
        ArrayList<Integer> array = new ArrayList<>();
        //创建花色数组和点数数组
        String[] colors = {"♦", "♣", "♥", "♠" };
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k", "A", "2" };
        //从0开始往HashMap里面存储编号，并存储对应的牌。同时往ArrayList里面存储编号⑤洗牌(洗的是编号)，用Collections的shuffle(方法实现
        int index = 0;
        for (String color : colors) {
            for (String number : numbers) {
                hm.put(index, color + number);
                array.add(index);
                index++;
            }
        }
        hm.put(index, "小王");
        array.add(index);
        index++;
        hm.put(index, "大王");
        array.add(index);
        //洗牌  洗的是编号
        Collections.shuffle(array);

        //发牌，发的也是编号，用TreeSet来接收
        TreeSet<Integer> zsset = new TreeSet<>();
        TreeSet<Integer> fwktset = new TreeSet<>();
        TreeSet<Integer> kaset = new TreeSet<>();
        TreeSet<Integer> dpset = new TreeSet<>();

        for (int i = 0;i< array.size();i++){
            Integer dp = array.get(i);
            if (i>= array.size()-3){
                dpset.add(dp);
            }else if (i%3==0){
                zsset.add(dp);
            }else if (i%3==1){
                fwktset.add(dp);
            } else if (i % 3 == 2) {
                kaset.add(dp);
            }
        }
        lookPoker("张三",zsset,hm);
        lookPoker("法外狂徒",fwktset,hm);
        lookPoker("Kamisora",kaset,hm);
        lookPoker("底牌",dpset,hm);

    }
    //定义看牌方法
    public static void lookPoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
        System.out.print(name+"的牌是:");
        for (Integer key:ts){
            String poker = hm.get(key);
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
