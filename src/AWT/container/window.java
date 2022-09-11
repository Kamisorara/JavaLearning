package AWT.container;

import java.awt.*;

public class window {
    public static void main(String[] args) {
        //创建一个窗口对象
        Frame frame = new Frame("测试Window");  //Frame 是Window的子类
        //指定窗口位置，大小
        frame.setLocation(100,100); //在桌面显示的位置
        frame.setSize(500,300);
        //设置窗口对象可见
        frame.setVisible(true);
    }
}
