package com.soft1841.Shape;

/**
 * 创建图形的父类
 * @author  蔡一帆
 * 2019.3.10
 */

public abstract class Shape {
    //声明两个受保护的属性
    protected double x;
    protected double y;

    public Shape(){
    }

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void show(){ System.out.println("面积"); }
    public abstract double getArea();
}
