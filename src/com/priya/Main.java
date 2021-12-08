package com.priya;

import com.priya.logger.AbstractLogger;
import com.priya.logger.ChainLoggers;

public class Main {

    public static void main(String[] args) {
        AbstractLogger loggerChain= ChainLoggers.getChainLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is info level message...");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is Debug level message...");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is error level message...");
    }
}
