package com.soft1841.sheji;

import java.util.Calendar;

public class TimeLoggerDecorator implements logger {
    private logger decoratorLogger;

    public TimeLoggerDecorator(logger decoratorLogger){
        this.decoratorLogger = decoratorLogger;
    }
    @Override
    public void log(String message) {
        decoratorLogger.log(message);
        logTime();
    }

    private void logTime() {
        System.out.println(Calendar.getInstance().getTime());
    }
}
