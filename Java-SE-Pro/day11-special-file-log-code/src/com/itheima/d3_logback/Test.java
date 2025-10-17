package com.itheima.d3_logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    //1.创建一个Logback框架的LOgger日志对象，来记日志
    public static final Logger LOGGER = LoggerFactory.getLogger("Test.class");
    public static void main(String[] args) {
        while (true) {
            try {
                LOGGER.info("除法开始了");
                chu(10, 2);
                LOGGER.info("除法执行成功了");
            } catch (Exception e) {
                LOGGER.error("除法执行失败了:"+e.getMessage());
            }
        }
    }
    public static void chu(int a, int b) {
        LOGGER.debug("参数a:"+a);
        LOGGER.debug("参数b:"+b);
        int c = a / b;
        LOGGER.info("结果c是:"+c);
    }
}
