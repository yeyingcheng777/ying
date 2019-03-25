package com.soft1841.list;

import com.sun.javafx.sg.prism.web.NGWebView;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1,"白夜行",24.00));
        bookList.add(new Book(2,"时间简史",48.00));
        bookList.add(new Book(3,"黑暗森林",30.20));
        System.out.println(bookList);
        bookList.add(2,new Book(4,"我的三体",26.20));
        System.out.println(bookList);
        bookList.remove(2);
        System.out.println(bookList);
        bookList.set(2,new Book(5,"黑暗永恒",36.00));
        System.out.println(bookList);
        System.out.println(bookList.get(1));
        bookList.add(new Book(6,"今夜无人入眠",18.30));
        System.out.println(bookList);
        System.out.println(bookList.indexOf(new Book(1,"白夜行",24.00)));
        System.out.println(bookList.lastIndexOf(new Book(1,"白夜行",24.00)));
        }


    }

