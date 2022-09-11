package 异常;

public class _Exception_1 {
    //方法1.try...catch...方法
    /*
    格式
    try{
       可能出现异常的代码;
    }catch(异常类名 变量名){   (变量名就是接收的对象)
    异常处理代码;
    }

执行流程:
程序从try里面的代码开始执行
出现异常，会自动生成一个异常类对象，该异常对象将被提交给Java运行时系统
当Java运行时系统接收到异常对象时，会到catch中去找匹配的异常类，找到后进行异常的处理执行完毕之后，程序还可以继续往下执行
     */
    //异常处理语句方法
    //Throwable成员方法
    /*
public String getMessage()   返回此throwable的详细消息字符串
public String toString()     诚回此可抛出的简短描述
public void printStackTrace()把异常的错误信息输出在控制台
     */
    public static void main(String[] args) {
        System.out.println("开始");
        methods();
        System.out.println("结束");
    }

    public static void methods() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]); //这样直接运行是肯定会出错的  可以使用try...catch...
        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("你输入的索引出错了，请更改索引");  一般我们也不采用这种输出形式
            e.printStackTrace();  //你要让别人知道错在哪儿了   一般使用这个方法比较好 ,比较全面
            System.out.println("getMessage():" + e.getMessage()); //这是异常的原因
            System.out.println("toString():"+e.toString());
        }
    }
}
