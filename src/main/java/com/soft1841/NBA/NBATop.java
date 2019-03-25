package com.soft1841.NBA;

import sun.security.util.Length;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NBATop {
    public static void main(String[] args) {
        List<NBA> nbaList = new ArrayList<>();
        nbaList.add(new NBA("乔丹", "飞人/神", 38.1, 6.2, 5.3));
        nbaList.add(new NBA("拉塞尔", "指环王", 15.1, 22.5, 4.3));
        nbaList.add(new NBA("贾巴尔", "天钩", 24.6, 11.2, 3.6));
        nbaList.add(new NBA("张伯伦", "篮球皇帝", 30.1, 22.9, 4.4));
        System.out.println("------NAB历史巨星------");
        System.out.println("姓名  绰号  得分  篮板  助攻");
        int len = nbaList.size();
        for (int i = 0; i < len; i++) {
            System.out.println(nbaList.get(i).getName() + " " + nbaList.get(i).getNickname() + " " + nbaList.get(i).getScore()
                    + " " + nbaList.get(i).getRebound() + " " + nbaList.get(i).getAssist());
            System.out.println();
        }
        System.out.println("用Iterator 迭代器输出结果");
        Iterator<NBA> iterator = nbaList.iterator();
        while (iterator.hasNext()){
            NBA nba = iterator.next();
            System.out.println(nba.getName() + " " + nba.getNickname() + " " + nba.getScore()
                    + " " + nba.getRebound() + " " + nba.getAssist());
        }
        System.out.println("Lambda表达式编历输出结果");
        nbaList.forEach(nba -> System.out.println(nba.getName() + " " + nba.getNickname() + " " + nba.getScore()
                + " " + nba.getRebound() + " " + nba.getAssist()));
    }
}
