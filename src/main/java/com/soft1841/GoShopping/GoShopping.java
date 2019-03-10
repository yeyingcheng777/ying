package com.soft1841.GoShopping;

/**
 * 定义一个GoShopping类，使用WallMarket类和TaobaoMarket类创建抽象类对象，赋值
 * @author 蔡一帆
 * 2019.3.10
 */

public class GoShopping {
    public static void main(String[] args) {
        Market market = new WallMarket();
        market.name = "沃尔玛";
        market.goods = "七匹狼西服";
        market.shop();
        market = new TaobaoMarket();
        market.name = "淘宝";
        market.goods = "韩都衣舍花裙";
        market.shop();
    }
}
