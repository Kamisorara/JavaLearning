package basic;

public class hello_world {
    public static void main(String[] args){
        System.out.println("hello world");
        System.out.println(true);
        System.out.println('g');
        /*
        Java中的基本数据类型分为数值型，和非数值型
         */
        {
            //定义变量
            boolean b = true;
            System.out.println(b);
            String a = "hello bitch";
            System.out.println(a);
            byte c = 10;
            System.out.println(c);
            System.out.println("---------------------------");
            double f = 0.1;
            System.out.println(f);
        }
        {
            String g = "hahaha";
            System.out.println(g);
        }
        {
            System.out.println("------------------------");
            //强制类型转换
            int num = (int)99.99;
            System.out.println(num);
            //强制类型转换可能会使数据的内容丢失
            {

                float a = 3;
                int b = 5;
                System.out.println(a/b);
            }
            {
                //定义两个变量
                char nums = 'c';
                int numss = 10;
                System.out.println(nums+numss);
            }
            {
                //字符串的+操作
                String str = "hello\t";
                String str2 = "birch";
                System.out.println(str+str2);
                {
                    /*
                    赋值运算符隐含了强制类型转换
                    这些基本的运算符的转换和其他语言的基本类似
                     */
                }
            }

        }
    }
    {
        //在Java中，比较重要的是自增自减运算符
        /*
        用++ 和 --来表示
         */
        int i = 1;
        System.out.println(i);

        //自增自减运算符也可以单独使用的
        i++;
        System.out.println(i);
    }
}
