package com.itheima.d1_properties;

import java.io.FileWriter;
import java.util.Properties;

public class PropertiesDemo2 {
    //目标：掌握使用Properties把键值对数据写出到属性文件中去
    public static void main(String[] args) throws Exception {
        //目标：掌握使用Properties把键值对数据写出到属性文件中去
        //1.创建属性集对象
        Properties properties=new Properties();
        properties.setProperty("admin","66666");
        properties.setProperty("玄冥二老","wangfei");
        properties.setProperty("金毛狮王","成昆");
        properties.setProperty("小昭","wuji");
        System.out.println(properties);

        //2.存储到文件
//        properties.store(new FileOutputStream("day11-special-file-log-code/src/com/itheima/d1_properties/users2.properties"),"i saved many users!");
        properties.store(new FileWriter("day11-special-file-log-code/src/com/itheima/d1_properties/users2.properties"),"i saved many users!");
    }
}
