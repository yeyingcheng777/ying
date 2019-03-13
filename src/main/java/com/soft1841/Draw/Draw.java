package com.soft1841.Draw;

import com.sun.glass.ui.Size;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.util.Random;

public class Draw {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int x1 = random.nextInt(1080);
        int y1 = random.nextInt(800);
        int x2 = random.nextInt(1080);
        int y2 = random.nextInt(800);
        BufferedImage bufferedImage = new BufferedImage(1080,800,BufferedImage.TYPE_INT_RGB);
        Graphics graphics = bufferedImage.getGraphics();
        Font font = new Font("微软雅黑",Font.BOLD, 16);
        graphics.setFont(font);
        graphics.setColor(Color.BLUE);
        graphics.fillRect(0,0,1080,800);
        System.out.println("点1:(" + x1 + "," + y1 +") 点2:(" + x2 + "," + y2 + ")");
        double distance =Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String string = decimalFormat.format(distance);
        System.out.println("两点距离为" + string);
        graphics.setColor(Color.BLACK);
        graphics.drawLine(x1,y1,x2,y2);
        graphics.drawString(string,(x1 + x2) / 2,(y1 + y2) / 2);
        File file = new File("D:/abc.jpg");
        OutputStream outputStream = new FileOutputStream(file);
        ImageIO.write(bufferedImage,"jpg",outputStream);
        outputStream.close();
    }
}
