package _常用API;

public class _System {
    //System常用的方法
    //public static void exit(int status)  终止当前运行的虚拟机，非0表示异常终止
    //public static long currentTimeMillis() 返回当前时间，以毫秒为单位
    public static void main(String[] args) {
        System.out.println("开始");
//        System.exit(0); //发现只有开始没有结束 ，说明在这里已经结束了
        System.out.println("结束");
        System.out.println(System.currentTimeMillis());//1639493133156

        System.out.println(System.currentTimeMillis() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");
        //表示的是当前时间到1970年的时间差

        //这个东西还可以记录程序运行的时间
        //比如下面随便搞一个for 循环
        //这里定义一个
        long start = System.currentTimeMillis();
        for (int i  =0;i<10000;i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("运行时间"+(end-start)+"毫秒");
    }


}
