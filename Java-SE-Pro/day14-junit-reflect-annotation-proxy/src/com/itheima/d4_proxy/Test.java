package com.itheima.d4_proxy;

public class Test {
    public static void main(String[] args) {
        //目标：创建代理对象
        //1.准备一个明星对象，设计明星类
        Star star =new Star("章若楠");
        //2.为章若楠创建一个专属代理
        StarService proxy = ProxyUtil.createProxy(star);
        proxy.sing("《现在你才不幸福》");
        System.out.println(proxy.dance());
    }
}
