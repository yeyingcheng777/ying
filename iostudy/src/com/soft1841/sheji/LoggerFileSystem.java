package com.soft1841.sheji;

public class LoggerFileSystem implements logger {
    @Override
    public void log(String message) {
        System.out.println("日志输出到本地系统" + message);
    }
}
