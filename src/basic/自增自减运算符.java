package basic;

public class 自增自减运算符 {
    public static void main(String[] args){
        int i = 10;
        System.out.println(i);

        int j = ++i;
        System.out.println(i);
        System.out.println("++在前面"+j);

        int k = i++;
        System.out.println(k+"++在后面");
        {
            /*
            在单独使用时 自增自减的效果是一样的
             */
            //如果++在后面就会先进行赋值的操作，然后再进行++的操作 也很好理解嘛，反正就放前面就是先进行++的操作
            //以此类推
        }
    }
}
