package com.itheima.demo;

public class Test4 {
    public static void main(String[] args) {
        //加密
        String pwd= encode(1983);
        System.out.println("加密后:"+pwd);
    }
    public static String encode(int number){
        String pwd="";
        //拆分
        int[] data=new int[4];
        data[0]=number/1000;
        data[1]=number/100%10;
        data[2]=number/10%10;
        data[3]=number%10;
        //遍历加密
        for (int i = 0; i < data.length; i++) {
            data[i]=(data[i]+5)%10;
        }
        //反转
        for (int i = 0,j=data.length-1; i < j; i++,j--) {
            int temp=data[j];
            data[j]=data[i];
            data[i]=temp;
        }

        for (int i = 0; i < data.length; i++) {
            pwd+=data[i];
        }
        return pwd;
    }
}
