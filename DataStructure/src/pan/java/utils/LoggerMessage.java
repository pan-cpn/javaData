package pan.java.utils;

import java.util.logging.Logger;

/**
 * @ProjectName: Java_Data
 * @Package: pan.java.utils
 * @ClassName: LoggerMessage
 * @Author: pys
 * @Description: 日志输出类
 * @createDate: 12/30/2022 2:42 AM
 */
public class LoggerMessage {
    public static final Logger logger = Logger.getLogger("myLogger");

    public static <T> void getString(T arg) {
        logger.info((String) arg);
    }
}