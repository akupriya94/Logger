package com.priya.logger;

public class ErrorLogger extends AbstractLogger{

    ErrorLogger(int level){
        this.setLevel(level);
    }

    @Override
    void write(String message) {
        System.out.println("Error: " + message);
    }

}
