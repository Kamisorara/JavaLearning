package _算法.KMP算法;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] str = "abababaaababaa".toCharArray();
        char[] sub = "ababaaababaa".toCharArray();

        //求next数组
        int[] next = new int[sub.length];
        int i = 1, j;
        while (i < next.length) {
            j = i - 1;
            //next数组推算过程
            while (true) {
                if (next[j] == 0 || sub[i - 1] == sub[next[j] - 1]) {
                    next[i] = next[j] + 1;
                    break;
                }
                j = next[j] - 1;
            }
            i++;
        }
        System.out.println("序号为" + Arrays.toString(sub));//序号为[a, b, a, b, a, a, a, b, a, b, a, a]
        System.out.println("Next数组" + Arrays.toString(next));//Next数组[0, 1, 1, 2, 3, 4, 2, 2, 3, 4, 5, 6]

        i = 0;  //表示上面位置
        j = 0;  //表示下面位置
        while (i < str.length) {
            if (str[i] == sub[j]) {
                i++;
                j++;
            } else {
                if (j == 0) i++;  //如果一上来就出错，移动i 重新开始匹配
                else j = next[j] - 1; //如果是中途出错，移动j 到next数组里指向的位置
            }
            if (j == sub.length) {
                System.out.println("匹配成功!!!");
                break;
            }
        }
    }
}
