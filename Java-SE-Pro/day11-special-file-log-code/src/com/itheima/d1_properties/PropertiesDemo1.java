package com.itheima.d1_properties;

import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：Properties读取属性文件中的键值对数据
        //1.创建属性集对象，代表一个属性文件
        Properties properties = new Properties();
        System.out.println(properties);

        //2.加载属性文件信息到属性集对象中去
//        properties.load(new FileInputStream("day11-special-file-log-code/src/com/itheima/d1_properties/users.properties"));
        properties.load(new FileReader("day11-special-file-log-code/src/com/itheima/d1_properties/users.properties"));
        System.out.println(properties);

        //根据键取值
//        System.out.println(properties.get("赵敏"));//map的api
        System.out.println(properties.getProperty("赵敏"));//properties的独有api，底层还是调用get()

//        properties.keySet();//map的api:取所有的键返回Set集合
        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys) {
            String value = properties.getProperty(key);//根据键取值
            System.out.println(key + "===>" + value);
        }
        //3.遍历数据
        properties.forEach((k, v) -> {
            System.out.println(k + "===>" + v);
        });
    }
}
