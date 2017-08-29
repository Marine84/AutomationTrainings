package loggers;

import org.apache.log4j.Logger;

public class Logging {

    //creation and retrieval methods
    private static Logger myLogger = Logger.getLogger(Logging.class);

    //printing methods of Info Logger
    public static void infoLogger() {
        try {
            brokenInfoMethod();
        } catch (Exception e) {
            myLogger.info(e.getMessage(), e);
        }
    }
    //printing methods of Warn Logger
    public static void warnLogger() {
        try {
            brokenWarnMethod();
        } catch (Exception e) {
            myLogger.warn(e.getMessage(), e);
        }
    }
    //printing methods of Error Logger
    public static void errorLogger() {
        try {
            brokenErrorMethod();
        } catch (Exception e) {
            myLogger.error(e.getMessage());
        }
    }

    public static void brokenErrorMethod() throws Exception {
        throw new Exception("Error Log: Test execution has Failed");
    }
    private static void brokenInfoMethod() throws Exception {
        throw new Exception("Info log: Test execution succeeded");
    }
    private static void brokenWarnMethod() throws Exception {
        throw new Exception("Warn log: Test Failed But Within Success Percentage");
    }
}

