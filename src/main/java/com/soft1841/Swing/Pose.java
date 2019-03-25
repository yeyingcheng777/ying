package com.soft1841.Swing;

import javax.swing.*;
import java.awt.*;

public class Pose extends JFrame {
    public Pose(){
        setTitle("本窗口使用流布局管理器");
        Container container = getContentPane();
        setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        container.add(new JLabel("下面四句诗，哪一句是描写夏天的"));
        container.add(new JButton("秋风萧瑟天气凉，草木摇荡露为霜"));
        container.add(new JButton("白雪纷纷何所以，撒盐空中差可拟"));
        container.add(new JButton("接天莲叶无穷碧，映日荷花别样红"));
        container.add(new JButton("竹外桃花三两枝，春江水暖鸭先知"));
        setSize(400,300);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Pose();
    }
}
