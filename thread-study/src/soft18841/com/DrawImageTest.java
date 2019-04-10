package soft18841.com;

import javax.swing.*;
import java.awt.*;

public class DrawImageTest extends JFrame {
    public DrawImageTest(){
        this.setSize(840,515);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new CanvasTest());
        this.setTitle("绘制图像");
    }

    public static void main(String[] args) {
        new DrawImageTest().setVisible(true);
    }
    class CanvasTest extends Canvas{
        public void paint(Graphics graphics){
            super.paint(graphics);
            Graphics2D graphics2D = (Graphics2D)graphics;
            Image image = new ImageIcon(this.getClass().getResource("/img/1.jpg")).getImage();
            graphics2D.drawImage(image,0,0,this);
        }
    }
}
