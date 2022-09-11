package basic;
import java.util.Random;
public class ramdom {
    public static void main(String[] args){
        Random r = new Random();
        int number = r.nextInt(100)+1;   //这里的100 指的是[0,100) 不包括最后一个 而在后面加上一个1 就表示的是从【1，101)
        System.out.println(number);
    }
}
