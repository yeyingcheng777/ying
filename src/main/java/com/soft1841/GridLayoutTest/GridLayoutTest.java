package com.soft1841.GridLayoutTest;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;

/**
 * 网格布局管理器和组件
 * @author 蔡一帆
 * 2019.3.27
 */
public class GridLayoutTest extends JFrame {
    //定义一个面板数组
    private JPanel[] panels;
    private JLabel dateLabel;
    private JLabel imgLabel;
    private JLabel imgLabel2;
    private Icon icon2;
    private Icon icon;
    private JLabel nameLabel;
    private JLabel nameLabel2;
    private JPasswordField jp;
    private JTextArea jt;
    private JRadioButton radioButton;

    private GridLayoutTest() {
        init();
        setTitle("GridLayout网格布局管理器");
        //界面启动最大化
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void init() {
        //设置整个容器背景
        getContentPane().setBackground(new Color(48, 28, 219));
        //设置3行3列的网格,组件间水平间距50像素，垂直间距30像素
        GridLayout gridLayout = new GridLayout(3, 3, 50, 30);
        setLayout(gridLayout);

        //创建面板数组
        panels = new JPanel[9];
        //循环创建每个面板对象
        for (int i = 0; i < 9; i++) {
            panels[i] = new JPanel();
            //面板加上边框
            panels[i].setBorder(BorderFactory.createTitledBorder("面板" + (i + 1)));
            //面板依次加入网格布局管理器，变成9宫格
            add(panels[i]);
        }

        //设置第一个面板的背景颜色，其布局方式默认为FlowLayout居中对齐
        panels[0].setBackground(new Color(121, 135, 242));
        //在第一个面板内加入5个按钮
        for (int i = 0; i < 5; i++) {
            panels[0].add(new JButton("恭喜WE！"));
        }

        //设置第二个面板为BorderLayout边界布局，设置背景颜色
        panels[1].setLayout(new BorderLayout(20, 20));
        panels[1].setBackground(new Color(67, 48, 221));
        //5个方向加入按钮
        panels[1].add(new JButton("957"), BorderLayout.NORTH);
        panels[1].add(new JButton("condi"), BorderLayout.SOUTH);
        panels[1].add(new JButton("xiye"), BorderLayout.WEST);
        panels[1].add(new JButton("mystic"), BorderLayout.EAST);
        panels[1].add(new JButton("ben"), BorderLayout.CENTER);

        //设置第三面板为GirdLayout网格布局,设置颜色
        panels[3].setLayout(new GridLayout(3, 3, 10, 10));
        panels[3].setBackground(new Color(242, 54, 32));
        //依次加入9个按钮
        for (int i = 0; i < 9; i++) {
            panels[3].add(new JButton(String.valueOf(i + 1)));
        }

        //设置第四面板为流式布局，加入滚动面板
        panels[2].setBackground(new Color(242, 142, 148));
        //创建文本区域组件，文本默认大小为20行30列
        JTextArea ta = new JTextArea(15, 36);
        //创建滚动面板，将文本域放入滚动面板中，
        panels[2].add(new JScrollPane(ta));

        //设置第五面板为流式布局，加入标签组件
        panels[4].setBackground(new Color(49, 160, 219));
        //创建JLabel组件
        LocalDateTime time = LocalDateTime.now();
        dateLabel = new JLabel(String.valueOf(time));
        panels[4].add(dateLabel);

        //设置第六面板为BorderLayout边界布局，加入标签组件
        panels[5].setLayout(new BorderLayout(20, 20));
        panels[5].setBackground(new Color(221, 203, 73));
        //在中部放图片
        //读入本地图片到到内存的字节数组
        imgLabel = new JLabel();
        File srcFile = new File("D:/1.jpg");
        InputStream inputStream;
        byte[] bytes = null;
        try {
            inputStream = new FileInputStream(srcFile);
            bytes = new byte[(int) srcFile.length()];
            inputStream.read(bytes);
        } catch (IOException e) {
            System.out.println("io异常");
        }
        icon = new ImageIcon(bytes);
        imgLabel.setIcon(icon);
        panels[5].add(imgLabel, BorderLayout.CENTER);
        //在南部放图片路径
        String name = srcFile.getPath();
        nameLabel = new JLabel(name);
        panels[5].add(nameLabel, BorderLayout.SOUTH);

        //设置第七面板为流式布局，加入密码框组件
        panels[6].setBackground(new Color(30, 150, 164));
        String password = "123456";
        jp = new JPasswordField(password, 30);
        //设置回显字符
        jp.setEchoChar('*');
        panels[6].add(jp);
        //获取密码框中输入的值，如下方法
        //密码框对象
        //JPasswordField passwordField = new JPasswordField();
        //获取密码字符数组
        //char ch[] = passwordField.getPassword();
        //将字符数组转换为字符串
        //String pwd = new String(ch);
        //设置第八面板
        panels[7].setBackground(new Color(232, 217, 47));
        String[] contents ={"面板1","面板2","面板3","面板4","面板5"};
        JList<String> jList = new JList<>(contents);
        JScrollPane jScrollPane = new JScrollPane(jList);
        jScrollPane.setBounds(100,10,109,100);
        panels[7].add(jScrollPane);
        //设置第九面板为GirdLayout网格布局，加入单选按钮
        panels[8].setBackground(new Color(25, 207, 219));
        panels[8].setLayout(new GridLayout(1, 3, 10, 10));
        //创建文本为“A”的单选按钮
        String[] strings = {"A", "B", "C"};
        for (int i = 0; i < 3; i++) {
            radioButton = new JRadioButton(strings[i]);
            panels[8].add(radioButton);
        }
    }

    public static void main(String[] args) {
        //用系统样式代替Swing默认样式
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new GridLayoutTest();
    }
}