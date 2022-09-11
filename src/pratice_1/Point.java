package pratice_1;

public class Point {

    /*
    1.玩家小明设置了一片菜园，这个菜园对角线坐标为
    点A:(195,103,-43)
    点B(193,75,-65)
    玩家小芳想破坏菜园破坏点为任意坐标:
    要求函数能够输入 X Y Z坐标，判断X Y Z坐标是否在AB点内,
     */

    //创建x,y,z

    //成立条件是C点(x3,y3,z3)的范围要限定在A,B所构成的矩形中，有类似于领地的概念
    //首先判断的条件是x3的范围要在x1,x2之间
    double x;
    double y;
    double z;

    //创建无参对象
    public Point() {
    }

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    //最后构建方法获取x,y,z   需要传入实例对象
    public void getPosition(Point p) {
        System.out.println(p + "坐标为(" + x + "," + y + "" + z + ")");
    }
}
