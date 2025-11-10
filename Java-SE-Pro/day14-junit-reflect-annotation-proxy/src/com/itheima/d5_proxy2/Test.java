package com.itheima.d5_proxy2;

import java.util.Arrays;

/**
 * 目标：动态代理的应用
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //1.创建用户业务对象
        UserService userService = ProxyUtil.createProxy(new UserServiceImpl());

        //2.调用用户业务的功能（方法）
        userService.login("admin","123456");

        userService.deleteUser();

        String[] names = userService.selectUser();
        System.out.println("查询到的用户是："+ Arrays.toString(names));
    }
}
