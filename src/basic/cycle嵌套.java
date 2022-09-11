package basic;

public class cycle嵌套 {
    public static void main(String[] args){
//        int sum = 0;
//        for (int i=1;i<=100;i++){    //你在定义任何变量时都要声明
//            for (int j=1;j<=100;j++){
//                sum++;
//
//            }
//        }
//        System.out.println(sum);
        int sum = 0;
//        for (int i = 1;i<=100;i++){
//            for (int j = i;j<=100;j+=3){
//                sum++;
//
//            }
//        }
//        System.out.println(sum);
        int i = 100;

        do {
            sum++;
            i--;
        }while (i>=1);
        System.out.println(sum);
    }
}
