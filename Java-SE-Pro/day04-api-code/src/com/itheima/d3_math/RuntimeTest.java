package com.itheima.d3_math;

//目标：了解Runtime的常用方法
public class RuntimeTest {
    public static void main(String[] args) {
//        1.public static Runtime getRuntime();返回与当前Java程序关联的运行时对象
        Runtime jre = Runtime.getRuntime();
//        2.public void exit(int status);终止当前运行的虚拟机，该参数用作状态代码；按照惯例，非0状态码表示异常终止
//        jre.exit(0);
//        3. public int availableProcessors (); 获取虚拟机能够使用的处理器数
        System.out.println("处理器数量:" + jre.availableProcessors());
//        4. public long totaMemory ();返回Java虚拟机中的内容总量。字节数
        System.out.println("Java虚拟机中的内存总量:" + jre.totalMemory() / 1024.0 / 1024.0 + "MB");
//        5. public long freeMemory (); 返回Java虚拟机中的可用内存量
        System.out.println("Java虚拟机中的可用内存量:" + jre.freeMemory() / 1024.0 / 1024.0 + "MB");
//        6. public Process exec (String command);执行命令，启动程序
    }
}
