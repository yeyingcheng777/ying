package com.soft1841.Calendar;

import java.util.Date;

public class Calendar {
    public static void main(String[] args) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int year = calendar.get(java.util.Calendar.YEAR);
        int month = calendar.get(java.util.Calendar.MONTH) + 1;
        int day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
        int hour = calendar.get(java.util.Calendar.HOUR_OF_DAY) + 4;
        int minute = calendar.get(java.util.Calendar.MINUTE);
        int second = calendar.get(java.util.Calendar.SECOND);
        System.out.println("当前时间" + year + "-" + month + "-" + day + " " + hour + ":"
        + minute + ":" + second);
        Date date = calendar.getTime();
        Long time = calendar.getTimeInMillis();
        System.out.println("当前时间为：" + date);
        System.out.println("当前毫秒数：" + time );
    }
}
