package pratice_1;

import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class point_demo {
    //用于测试
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入A点的坐标(x,y,z):");
        Double x1 = sc.nextDouble();
        Double y1 = sc.nextDouble();
        Double z1 = sc.nextDouble();

        System.out.println("请输入B点的坐标(x,y,z)");
        Double x2 = sc.nextDouble();
        Double y2 = sc.nextDouble();
        Double z2 = sc.nextDouble();

        System.out.println("请输入C点的坐标:(x,y,z)");
        Double x3 = sc.nextDouble();
        Double y3 = sc.nextDouble();
        Double z3 = sc.nextDouble();

        Point a = new Point(x1, y1, z1);
        Point b = new Point(x2, y2, z2);
        Point c = new Point(x3, y2, z3);


        a.getPosition(a);
        b.getPosition(b);
        c.getPosition(c);
        //成立条件是
        //首先进行判断的是A，B两点，谁在前谁在后
        if (x1 > x2) {
            if (x1 >= x3 && x3 >= x2 && y1 >= y3 && y3 >= y2 && z1 >= z3 && z3 >= z2)
                System.out.println("C点在A、B点内");
            else
                System.out.println("C点在A、B点外");
        } else {
            if (x1 <= x3 && x3 <= x2 && y1 <= y3 && y3 <= y2 && z1 <= z3 && z3 <= z2)
                System.out.println("C点在A、B点内");
            else
                System.out.println("C点在A、B点外");
        }
    }
}
