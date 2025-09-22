package com.itheima04;

public class MethodTest03
{
    public static void main(String[] args) {
        int max = getMax(10, 20, 30);
        System.out.println("10,20,30中的较大值是："+max);
    }
    public static int getMax(int a,int b,int c){
//        if(a>=b){
//            if(a>c){
//                return a;
//            }else {
//                return c;
//            }
//        }else {
//            if(b>=c){
//                return b;
//            }else  {
//                return c;
//            }
//        }
        int tempMax=a>b?a:b;
        int max=tempMax>c?tempMax:c;
        return max;
    }
}
