package _算法.KMP算法;

import java.util.Arrays;

public class KMP练习 {
    public static void main(String[] args) {
        char[] str = "asdnkadnmfjkamisorakamkakadskmf".toCharArray();
        char[] sub = "kamisora".toCharArray();
        int[] next = new int[sub.length];

        int i = 1, j;
        while (i < next.length) {
            j = i - 1;
            while (true) {
                if (next[j] == 0 || sub[i - 1] == sub[next[j] - 1]) {
                    next[i] = next[j] + 1;
                    break;
                }
                j = next[j] - 1;
            }
            i++;
        }
        i = 0;
        j = 0;
        while (i < str.length) {
            if (str[i] == sub[j]) {
                i++;
                j++;
            } else {
                if (j == 0) {
                    i++;
                } else {
                    j = next[j] - 1;
                }
            }
            if (j == sub.length) {
                System.out.println("匹配成功！");
                break;
            }
        }
    }
}

