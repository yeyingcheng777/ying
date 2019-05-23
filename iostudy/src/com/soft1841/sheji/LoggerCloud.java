package com.soft1841.sheji;

public class LoggerCloud implements logger {
    @Override
    public void log(String message) {
        System.out.println("日志输出到云平台" + message);
    }
}
