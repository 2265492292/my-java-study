package com.itheima.d5_list;

import java.util.LinkedList;

public class ListTest4 {
    //LinkedList双链表
    //队列：先进先出，后进后出
    //栈：后进先出，先进后出（压栈/进栈||弹出/出栈）

    public static void main(String[] args) {
        //目标：掌握LinkedList的应用
        //1.做队列
        //队列：先进先出，后进后出
        LinkedList<String> queue =new LinkedList<>();
        //入队
        queue.addLast("第1个人");
        queue.addLast("第2个人");
        queue.addLast("第3个人");
        queue.addLast("第4个人");
        //出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

        //2.做栈
        //栈：后进先出，先进后出（压栈/进栈||弹出/出栈）
        LinkedList<String> stack = new LinkedList<>();
        stack.push("第1颗子弹");
        stack.addFirst("第2颗子弹");
        stack.addFirst("第3颗子弹");
        stack.addFirst("第4颗子弹");
        stack.addFirst("第5颗子弹");
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack);
    }
}
