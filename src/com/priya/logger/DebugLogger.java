package com.priya.logger;

public class DebugLogger extends AbstractLogger{

    DebugLogger(int level) {
        this.setLevel(level);
    }

    @Override
    void write(String message) {
        System.out.println("Debug: " + message);
    }
}
