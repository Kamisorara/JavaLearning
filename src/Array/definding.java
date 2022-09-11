package Array;

public class definding {
    public static void main(String[] args) {
        //数组定义的格式
        //数据类型[]  变量名
        /* int [] arr;   //更加推荐这种定义数组的方式
        //或者  数据类型  变量名[]
        int  arrs[];*/
        {
            //数组动态初始化
            //Java中的数组必须要初始化才能使用
            //数据类型 [] arr = new int[3];  这里的3就是数组长度 ,就是数组中的元素个数
            int[] arr = new int[3];
            //输出数组数组名
            System.out.println("----------------------------");
            System.out.println(arr); //[I@776ec8df 内存地址
            System.out.println(arr[0]);//0
            System.out.println(arr[1]);//0
            System.out.println(arr[2]);//0
//            System.out.println(arr[4]);//Array.definding.main(definding.java:20)超出了长度
            System.out.println("--------------------------------");
        }
        {
            int[] arr2 = new int[3];
            arr2[0] = 100;
            arr2[2] = 200;
            arr2[3] = 300;

            //定义第三个数组，将第三个数组指向第二个数组
            int[] arr3 = arr2;
            arr3[0] = 100;
            System.out.println(arr2);
            System.out.println(arr3);
            System.out.println(arr3[0]);


        }
    }
}
