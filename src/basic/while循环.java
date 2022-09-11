package basic;

public class while循环 {
    public static void main(String[] args) {
//        int sum = 0;
//        int i = 1;
//        while(i<=100){
//            sum++;
//            i++;
//        }
//        System.out.println(sum);
        //一个小实例
//        int heigh = 8844430;
//        double thick = 0.1;
//        int sum = 0;
//        while (thick <= heigh) {
//            thick *= 2;
//            sum++;
//
//        }
//        System.out.println("你需要折叠"+sum);
        {
            //do ...while 循环语句
            int sum = 0;
            int i = 1;
            do {
                sum++;
                i++;
            } while (i <= 100);
            System.out.println(sum);
            //不管怎么样,先执行do 里面的循环体语句，再进行while 的判断,反正不管怎么样do都会执行一次
        }
    }

}
