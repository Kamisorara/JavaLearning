package _算法.leetcode.TwoSum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            list.add(num);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size() - 1; j++) {
                if (list.get(i) + list.get(j) == list.get(list.size() - 1)) {
                    System.out.println(i + " "+j);
                }
            }

        }
    }
}
//#include <iostream>
//using namespace std;
//
//int main(int argc, char **argv){
//  int i,j;
//  for(i = 1; i <= 9; i++){
//    for(j = 1; j<=i; j++){
//      cout << j << "*" << i << "=" << j*i << " ";
//    }
//    cout << endl;
//  }
//}


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int d = scanner.nextInt();
//        int e = scanner.nextInt();
//        int f = scanner.nextInt();
//        int g = scanner.nextInt();
//        int h = scanner.nextInt();
//        int i = scanner.nextInt();
//
//        int j = scanner.nextInt();
//        int k = scanner.nextInt();
//        int l = scanner.nextInt();
//
//        int m = scanner.nextInt();
//        int n = scanner.nextInt();
//        int o = scanner.nextInt();
//
//        int p = scanner.nextInt();
//        int q = scanner.nextInt();
//        int r = scanner.nextInt();
//        System.out.println((a + j) + " " + (b + k) + " " + (c + l) + " ");
//        System.out.println((d + m) + " " + (e + n) + " " + (f + o) + " ");
//        System.out.println((g + p) + " " + (h + q) + " " + (i + r));
//    }
//}