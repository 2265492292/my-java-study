package com.itheima.d1_innerclass1;

public class People {
    private int heartBeat =110;
    //成员内部类
    public class Heart{
        private int heartBeat=95;
        public void show(){
            int heartBeat =80;
            System.out.println(heartBeat);//输出80
            System.out.println(this.heartBeat);//输出95
            //this代表当前 对象 的成员变量
            System.out.println(People.this.heartBeat);//输出110
        }
    }
}
