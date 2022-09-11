package AWT.container;

import java.awt.*;

public class ScrollPaneDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("这里演示");
        //创建ScrollPane对象
        ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        //往ScrollPane中添加对象
        sp.add(new TextField("这是一个这是一个测试文本2"));
        sp.add(new TextField("这是测试文本"));
        sp.add(new Button("This is a Demo Button"));   //在展示的时候只会显示一个按钮组件
        //把ScrollPane添加到Frame中
        frame.add(sp);

        //设置窗口大小
        frame.setBounds(100, 100, 500, 300);
        frame.setVisible(true);
    }
}
