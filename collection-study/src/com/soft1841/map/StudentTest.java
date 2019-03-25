package com.soft1841.map;

import javax.swing.*;
import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        list1.add(new Student(1, "张三"));
        list1.add(new Student(2, "李四"));
        list2.add(new Student(3, "王五"));
        list2.add(new Student(4, "孙六"));
        Map<String, List<Student>> map = new HashMap<>();
        map.put("男生", list1);
        map.put("女生", list2);
        System.out.println("****************按性别输出集合的结果*****************");
        Iterator<Map.Entry<String, List<Student>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<Student>> entry = iterator.next();
            System.out.println(entry.getKey());
//            Iterator<Student> listIter = entry.getValue().iterator();
//            while (listIter.hasNext()) {
//                System.out.println(listIter.next());
//            }
            List<Student> list =entry.getValue();
            list.forEach(student -> {
                System.out.println(student.getId() + " \t" + student.getName());
                System.out.println();
            });
        }
    }
}
