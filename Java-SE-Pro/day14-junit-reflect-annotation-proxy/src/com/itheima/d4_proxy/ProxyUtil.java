package com.itheima.d4_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理工具类
 */
public class ProxyUtil {
    public static StarService createProxy(Star s) {
        /**
         * 参数一：用于指定用哪个类加载器，去加载生成的代理类
         * 参数二：用于指定代理类需要实现的接口：明星类实现了哪些接口，代理类就需要实现哪些接口
         * 参数三：用于指定代理类的处理类：代理类需要调用目标对象的哪些方法，处理类就需要实现哪些方法
         */
        StarService proxy = (StarService) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
//                new Class[]{StarService.class},
                s.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //声明代理对象要做的事情
                        //参数一：proxy  代理对象——star
                        //参数二：method  正在被代理的方法——sing
                        //参数三：args  正在被代理的方法的参数——《现在你才不幸福》
                        String methodName = method.getName();
                        if  ("sing".equals(methodName)) {
                            System.out.println("准备话筒，美美收米咯💴");
                        } else if ("dance".equals(methodName)) {
                            System.out.println("准备场地，美美收米咯💴");
                        }
                        //调用目标对象方法
                        Object result = method.invoke(s, args);
                        return result;
                    }
                });
        return proxy;
        //返回StarService类型，因为代理也要实现这个接口--多态写法
    }
}
