package _File;

import java.io.File;

public class 遍历目录 {
    //需求:给定一个路径(E\\itcast)，请通过递]浣成遍历该目录下的所有内容，并把所有文件的绝对路径输出在控制台
    public static void main(String[] args) {
        //给定一个路径获取目录下的所有内容
        File file = new File("D:\\java学习");
        getAllFile(file);
    }
    //定义一个方法，用于获取给定目录下的所有内容，参数为第1步创建的File对象
    //可以用递归的方式获取一个文件夹里的所有路径
    public static void getAllFile(File f) {
        File[] fileArray = f.listFiles();
        //遍历file数组得到每一个file对象
        if (fileArray != null) {   //确认非空
            for (File file : fileArray) {
                if (file.isDirectory()) {  //判断file是否为目录
                    //如果是，就递归调用
                    getAllFile(file);
                } else {
                    //如果不是就将绝对路径进行输出
                    System.out.println(file.getAbsoluteFile());  //获取绝对路径
                }
            }
        }
    }
}
