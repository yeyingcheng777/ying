package com.soft1841.DateDifferentExample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

/**
 * 计算两个Date的差值
 * @author  蔡一帆
 * 2019.3.18
 */

public class DateDifferentExample {
    public static void main(String[] args) {
        String Time1 = "2019-03-18 08:20:15";
        String Time2 = "2019-03-16 22:43:48";
        String Time3 = "2019-03-18 00:01:12";
        String Time4 = "2019-03-18 00:08:39";
        Date localTime = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(localTime);
        Date d1;
        Date d2;
        Date d3;
        Date d4;
        Date d5;
        long diff1 = 0;
        long diff2 = 0;
        long diff3 = 0;
        long diff4 = 0;
        try {
            d1 = format.parse(Time1);
            d2 = format.parse(Time2);
            d3 = format.parse(Time3);
            d4 = format.parse(Time4);
            d5 = format.parse(time);
            diff1 = d5.getTime() - d1.getTime() ;
            diff2 = d5.getTime() - d2.getTime();
            diff3 = d5.getTime() - d3.getTime();
            diff4 = d5.getTime() - d4.getTime();
        }catch (ParseException e){
            e.printStackTrace();
        }
        long diffMinutes = diff1 / (1000 * 60);
        long diffHours = diff3 / (1000 * 60 * 60);
        long diffDays = diff2 / (1000 * 60 * 60 * 24);
        System.out.println("北京时间" + time);
        System.out.println(Time1 +"  " + Math.abs(diffMinutes) + "分前");
        System.out.println(Time3 +"  "  +Math.abs(diffHours) + "小时前");
        System.out.println(Time2 + "  " + Math.abs(diffDays) + "天前");
        System.out.println(Time4 + "  " + "刚刚");
    }
}
