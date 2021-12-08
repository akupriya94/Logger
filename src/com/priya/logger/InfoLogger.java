package com.priya.logger;

public class InfoLogger extends AbstractLogger{

    InfoLogger(int level) {
        this.setLevel(level);
    }

    @Override
    void write(String message) {
        System.out.println("Info: " + message);
    }

}
