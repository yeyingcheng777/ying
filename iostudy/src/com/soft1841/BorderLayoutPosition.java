package com.soft1841;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutPosition extends JFrame {
    public BorderLayoutPosition(){
        setTitle("边界布局");
        Container c = getContentPane();
        setLayout(new BorderLayout());
        JButton centerBtn = new JButton("中神通");
        JButton northBtn = new JButton("北丐");
        JButton westBtn = new JButton("西毒");
        JButton southBtn = new JButton("南帝");
        JButton eastBtn = new JButton("东邪");
        c.add(centerBtn,BorderLayout.CENTER);
        c.add(northBtn,BorderLayout.NORTH);
        c.add(westBtn,BorderLayout.WEST);
        c.add(eastBtn,BorderLayout.EAST);
        c.add(southBtn,BorderLayout.SOUTH);
        setSize(650,500);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BorderLayoutPosition();
    }
}