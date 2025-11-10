package com.itheima.d5_proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static <T> T createProxy(T obj) {
        T proxy = (T) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),
                obj.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        long start = System.currentTimeMillis();//记录开始时间 1970年1月1日0时0分0秒0毫秒 到  当前时间点之间所经历的毫秒数
                        //调用目标方法
                        Object result = method.invoke(obj, args);
                        long end = System.currentTimeMillis();//记录结束时间 1970年1月1日0时0分0秒0毫秒 到  当前时间点之间所经历的毫秒数
                        System.out.println(method.getName() + "方法耗时：" + (end - start) / 1000.0 + "秒");

                        return null;
                    }
                });
        return proxy;
    }
}
