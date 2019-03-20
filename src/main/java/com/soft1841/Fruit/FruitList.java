package com.soft1841.Fruit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FruitList {
    public static void main(String[] args) {
        List<Fruit> list = new ArrayList<>();
        list.add(new Fruit("苹果", (double) 10));
        list.add(new Fruit("香蕉", (double) 12));
        list.add(new Fruit("桃子", (double) 8));
        list.add(new Fruit("西瓜", (double) 14));
        Collections.sort(list);
        for (Fruit fruit:list) {
            System.out.println("名称：" + fruit.getName() + ",价格:" + fruit.getPrice());
        }
    }
}
