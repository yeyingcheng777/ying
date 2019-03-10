package com.soft1841.Shape;

/**
 * 定义矩形
 */

public class Rectangle extends Shape {
    public Rectangle(){super();}

    public Rectangle(double x, double y){super(x,y);}
    @Override
    public void show(){
        System.out.println("矩形的面积是：");
    }
    @Override
    public double getArea() {
        return this.x * this.y;
    }
}
