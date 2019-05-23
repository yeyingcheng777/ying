package com.soft1841.sheji;

public class LoggerTest {
    public static void main(String[] args) {
        logger logger = new TimeLoggerDecorator(new LoggerFileSystem());
        logger.log("登录系统...");
        logger logger1 = new TimeLoggerDecorator(new LoggerCloud());
        logger1.log("登录系统...");
    }
}
