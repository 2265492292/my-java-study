package com.itheima.d3_math;

public class SystemTest {

    public static void main(String[] args) {
        //1.public static void exit(int status);
//    终止当前运行的虚拟机，该参数用作状态代码；按照惯例，非0状态码表示异常终止
        System.out.println("开始");
//        System.exit(0);
//        2.public static long currentTimeMillis();返回的是从1970-1-1 00:00:00到现在的总毫秒值(1s=1000ms)
        long time =System.currentTimeMillis();
        System.out.println(time);

        //可以做性能统计
        for (int i = 0; i < 1000000; i++) {
            System.out.println(i);
        }
        long time2=System.currentTimeMillis();
//        System.out.println((time2-time)/1000+"s");
        System.out.println((time2-time)+"ms");
    }
}
