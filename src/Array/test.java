package Array;

public class test {
    public static void main(String[] args) {
        //数组元素求和
        int sum = 0;
        int [] arr = {68,27,95,88,171,996,51,210};
        for (int i = 0;i< arr.length;i++){
            if (arr[i]%10!=7 && arr[i]/10%10!=7 &&arr[i]%2 ==0){
                sum+=arr[i];
            }
        }
        System.out.println("最终结果是"+sum);
    }
}
