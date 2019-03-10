package com.soft1841.week1;

/**
 * 定义TaobaoMarket类，继承Market抽象类
 * @author 蔡一帆
 * 2019.3.10
 */

public class TaobaoMarket extends Market {

    @Override
    public void shop() {
        System.out.println(name + "网购" + goods);
    }
}
