package function;
import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        //带参数方法的定义和调用
        // public static void 方法名（参数） {... ...}
        //如果是单个参数  public static void 方法名 （数据类型 变量名）{... ...}
        //多个参数public static void 方法名 （数据类型 变量名，数据类型 变量名，。。。。。。）{... ...}
        int a  =1 ;
        int b = 2 ;
        isEvenNumber(a);

    }
    public static void isEvenNumber( int number ){
            if (number%2==0){
                System.out.println("是");
            } else{
                System.out.println("不是");
            }
        }
}
