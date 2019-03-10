package com.soft1841.week1;

/**
 * 定义WallMarket类，继承Market抽象类
 * @author 蔡一帆
 * 2019.3.10
 */

public class WallMarket extends Market{
    @Override
    public void shop() {
        System.out.println(name + "实体店购买" + goods);
    }
}
