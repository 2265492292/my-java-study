package com.itheima04;

public class MethodTest01 {
    public static void main(String[] args) {
        int result=sum(5);
        System.out.println("1-5的和是" + result);
        result=sum(100);
        System.out.println("1-100的和是" + result);
    }
    public static int sum(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}
