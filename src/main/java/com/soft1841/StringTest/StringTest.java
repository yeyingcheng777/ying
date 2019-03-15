package com.soft1841.StringTest;

/**
 * String StringBuffer StringBuilder的比较
 * @author 蔡一帆
 *
 */

public class StringTest {
    //定义次数
    private static int time = 50000;
    public static void main(String[] args) {
        testString();
        testStringBuffer();
        testStringBuilder();
    }

    public static void testString() {
        String string = "";
        //获取毫秒为单位的开始时间
        long begin =System.currentTimeMillis();
        for (int i =0; i < time; i ++){
            string += "java";
        }
        //获取毫秒为单位的结束时间
        long over =System.currentTimeMillis();
        System.out.println("操作String类型的使用的时间为：" + (over - begin ) + "毫秒");
    }

    public static void testStringBuffer() {
        StringBuffer stringBuffer = new StringBuffer();
        long begin = System.currentTimeMillis();
        for (int i =0; i < time; i ++){
            stringBuffer.append("java");
        }
        long over = System.currentTimeMillis();
        System.out.println("操作StringBuffer类型的使用的时间为：" + (over - begin) + "毫秒");
    }

    public static void testStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        long begin =System.currentTimeMillis();
        for (int i = 0;i <time;i ++ ){
            stringBuilder.append("java");
        }
        long over = System.currentTimeMillis();
        System.out.println("操作StringBuilder类型的使用的时间为：" + (over - begin) + "毫秒");
    }
}
