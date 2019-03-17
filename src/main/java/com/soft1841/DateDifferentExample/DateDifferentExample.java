package com.soft1841.DateDifferentExample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 计算两个Date的差值
 * @author  蔡一帆
 * 2019.3.18
 */

public class DateDifferentExample {
    public static void main(String[] args) {
        String startTime = "2019-03-16 20:31:58";
        String stopTime = "2019-03-17 22:43:48";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1;
        Date d2;
        long diff = 0;
        try {
            d1 = format.parse(startTime);
            d2 = format.parse(stopTime);
            diff = d2.getTime() - d1.getTime();
        }catch (ParseException e){
            e.printStackTrace();
        }
        long diffSeconds = diff / 1000;
        long diffMinutes = diff / (1000 * 60);
        long diffHours = diff / (1000 * 60 * 60);
        long diffDays = diff / (1000 * 60 * 60 * 24);
        System.out.println("两个时间相差：" + Math.abs(diffSeconds) + "秒");
        System.out.println("两个时间相差：" + Math.abs(diffMinutes) + "分");
        System.out.println("两个时间相差：" + Math.abs(diffHours) + "小时");
        System.out.println("两个时间相差：" + Math.abs(diffDays) + "天");
    }
}
