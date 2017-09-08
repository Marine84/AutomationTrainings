package loggers;

import org.apache.log4j.Logger;

public class Logging {

    //creation and retrieval methods
    private static Logger myLogger = Logger.getLogger("Logging test");

    //printing methods of Info Logger
    public static void infoLogger(String infoLogText) {
        myLogger.info(infoLogText);
    }
    //printing methods of Warn Logger
    public static void warnLogger(String warnLogText) {
        myLogger.warn(warnLogText);
    }
    //printing methods of Error Logger
    public static void errorLogger(String errLogText) {
        myLogger.error(errLogText);
    }
}

