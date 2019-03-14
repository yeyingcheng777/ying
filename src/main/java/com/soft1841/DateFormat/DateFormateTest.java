package com.soft1841.DateFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormateTest {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df1 = DateFormat.getDateInstance();
        DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss EE");
        DateFormat df3 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒 EE", Locale.CHINA);
        DateFormat df4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss EE",Locale.US);
        DateFormat df5 = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat df6 = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println("------将日期进行不同格式进行输出-------");
        System.out.println("按照Java默认的日期格式："+df1.format(date));
        System.out.println("按照Java默认的日期格式："+df1.format(date));
        System.out.println("按照指定的格式 yyyy-MM-dd hh:mm:ss EE,系统默认区域："+df2.format(date));
        System.out.println("按照指定的格式 yyyy年MM月dd日 hh时mm分ss秒,区域为中国："+df3.format(date));
        System.out.println("按照指定的格式 yyyy-MM-dd日 hh：mm：ss,区域为美国："+df4.format(date));
        System.out.println("按照指定格式 yyyy-MM-dd:"+df5.format(date));
        System.out.println("按照指定格式yyyy年MM月dd日：" +df6.format(date));
    }
}
