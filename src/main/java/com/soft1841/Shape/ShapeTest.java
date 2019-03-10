package com.soft1841.Shape;

/**
 * 定义实现类
 * @author 蔡一帆
 * 2019.3.10
 */
public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Rectangle(4,4);
        shape.show();
        System.out.println(shape.getArea());
        Shape shape1 = new Circular(4,3.14);
        shape1.show();
        System.out.println(shape1.getArea());
    }
}
