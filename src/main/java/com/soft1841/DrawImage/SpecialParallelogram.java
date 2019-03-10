package com.soft1841.DrawImage;

/**
 * 定义特殊的平行四边形类
 * @author 蔡一帆
 * 2019.3.10
 */

public class SpecialParallelogram {
    public static void main(String[] args) {
        //接口也可以进行向上转型操作
        DrawImage[] images = {new Rectangle(),new Square(),new Diamond()};
        //编历“画图形”接口类型的数组
        for (int i = 0; i < images.length;i++){
            images[i].draw();
        }
    }
}
