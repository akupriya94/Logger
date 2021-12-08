package com.priya.logger;

public abstract class AbstractLogger {
    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;

    private int level;
    private AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public AbstractLogger getNextLogger() {
        return nextLogger;
    }

    public void logMessage(int level, String message) {
        if(this.level<=level) {
            write(message);
        }

        if(nextLogger!=null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract void write(String message);

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
