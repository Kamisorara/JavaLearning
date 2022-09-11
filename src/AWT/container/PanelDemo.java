package AWT.container;

import java.awt.*;

public class PanelDemo {
    public static void main(String[] args) {
        //创建Window对象    容器不能存在，而是要依附于Window存在
        Frame fr = new Frame("演示Panel");
        //创建Panel对象
        Panel p = new Panel();
        //创建一个文本框,并且把他们放入到Panel当中
        p.add(new TextField("这是一个测试文本"));
        p.add(new TextField("这是一个测试文本2")); //两个文本控件的高度不一致...
        p.add(new TextField("测试文本3"));
        p.add(new Button("This is a test Button"));
        p.add(new Checkbox("同意"));
        //把Panel放入Window中
        fr.add(p);
        //设Window的位置以及大小
        fr.setBounds(100, 100, 500, 300);
        //设置Window可见
        fr.setVisible(true);  //编码和解码要一致
    }
}
