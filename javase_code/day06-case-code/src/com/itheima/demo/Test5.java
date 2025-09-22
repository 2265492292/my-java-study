package com.itheima.demo;

public class Test5 {
    public static void main(String[] args) {
        //理解数组拷贝
        int[] arr1={11,22,33};
        int[] arr2=copy(arr1);

        printArray(arr1);
        printArray(arr2);
    }
    public static int[] copy(int[] arr){
        //1.创建新数组，长度相同
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        return arr2;
    }
    public static void printArray(int[] arr){
        if (arr==null) {
            System.out.println(arr);
            return;
        };
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(i==arr.length-1?arr[i]:arr[i]+",");
        }
        System.out.println("]");
    }
}
