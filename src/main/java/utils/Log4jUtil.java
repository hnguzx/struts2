package utils;

import org.apache.log4j.Logger;

public class Log4jUtil {
    private static Logger logger = Logger.getLogger((new Exception()).getStackTrace()[1].getClassName());
    public static Logger getLogger() { return logger; }
}
