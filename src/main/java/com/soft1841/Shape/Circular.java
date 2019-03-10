package com.soft1841.Shape;

/**
 * 定义圆形类
 * @author  蔡一帆
 * 2019.3.10
 */

public class Circular extends Shape {

    public Circular(){super();}

    public Circular(double x,double y){super(x,y);}

    @Override
    public void show(){
        System.out.println("圆形的面积是");
    }
    @Override
    public double getArea() {
        return super.x * super.x * super.y;
    }
}
