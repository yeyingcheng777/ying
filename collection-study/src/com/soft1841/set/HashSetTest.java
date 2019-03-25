package com.soft1841.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * set接口基础程序
 */
public class HashSetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");
        System.out.println(set);
        //用for循环遍历集合
        System.out.println("for循环遍历set集合");
        Object[] array = set.toArray();
        int len = array.length;
        for (int i = 0;i < len;i++ ){
            System.out.print(array[i] +" ");
        }
        //用Iterator遍历集合
        System.out.println("Iterator遍历set集合`");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "  ");
        }
        System.out.println("----------------------间隔--------------------------");
        //用lamdba遍历集合
        set.forEach(s -> System.out.print(s + "  "));
    }
}
