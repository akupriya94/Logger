package com.priya.logger;

public class ChainLoggers {
    public static AbstractLogger getChainLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);
        return errorLogger;
    }
}
